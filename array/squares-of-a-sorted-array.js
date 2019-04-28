/**
 * @param {number[]} A
 * @return {number[]}
 */
var sortedSquares = function(A) {
    if (A === null || A.length === 0) {
    	return A;
    }
    let l = A.length;
    var res = new Array(l);
    let i = 0;
    let j = l - 1;
    let p = l - 1;
    while (p >= 0) {
    	if (-A[i] > A[j]) {
    		res[p] = A[i] * A[i];
    		i++;
    	} else {
    		res[p] = A[j] * A[j];
    		j--;
    	}
    	p--;
    }
    return res;
};

var arr = [-4,-1,0,3,10];
var res = sortedSquares(arr);
console.log(res);