function forEachElement(arr, callback) {
    for (let i = 0; i < arr.length; i++) {
        callback(arr[i], i);
    }
}

// Call with anonymous function
forEachElement([1, 2, 3, 4], function(element, index) {
    console.log("Index:", index, "Value:", element * 2);
});