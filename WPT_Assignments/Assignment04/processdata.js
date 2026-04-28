function fetchData(url, callback) {
    setTimeout(() => {
        const response = "raw data from " + url;
        callback(null, response);
    }, 2000);
}

function processData(data, callback) {
    const processed = data.toUpperCase();
    callback(processed);
}

// Chaining callbacks
fetchData("https://api.example.com", function(error, response) {
    if (error) {
        console.log("Error:", error);
    } else {
        processData(response, function(result) {
            console.log("Processed Data:", result);
        });
    }
});