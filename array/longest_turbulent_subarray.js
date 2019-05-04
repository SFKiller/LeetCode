var maxTurbulenceSize = function(A) {
	if (A == null || A.length == 1) {
		return 1;
	}
	let maxLen = 1;
	let inc = 1;
	let des = 1;
	for (var i = A.length - 1; i > 0; i--) {
		if (A[i - 1] > A[i]) {
			inc = des + 1;
			des = 1;
			if (maxLen < inc) {
				maxLen = inc;
			}
		} else if (A[i - 1] < A[i]) {
			des = inc + 1;
			inc = 1;
			if (maxLen < des) {
				maxLen = des;
			}
		} else {
			inc = 1;
			des = 1;
		}
	}
	return maxLen;
};

var arr = [9,4,2,10,7,8,8,1,9];
console.log(maxTurbulenceSize(arr));