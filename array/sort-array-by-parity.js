/**
 * @param {number[]} A
 * @return {number[]}
 */
var sortArrayByParity = function(A) {
    let start = 0;
    let end = A.length - 1;
    while (start < end) {
    	if (A[start] % 2 === 0) {
    		start++;
    		continue;
    	}
    	if (A[end] % 2 === 1) {
    		end--;
    		continue;
    	}
    	const temp = A[end];
    	A[end] = A[start];
    	A[start] = temp;
    	start++;
    	end--;
    }
    return A;
};

var arr = [1, 0, 3];
var res = sortArrayByParity(arr);
console.log(res);