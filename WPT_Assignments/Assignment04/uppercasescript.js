function processData(str, callback) {
    const result = callback(str);
    console.log(result);
}

function toUpperCase(str) {
    return str.toUpperCase();
}

// Call function
processData("hello world", toUpperCase);