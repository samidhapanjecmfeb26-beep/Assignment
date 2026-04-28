function fetchData(url, callback) {
    console.log("Fetching data from:", url);

    setTimeout(() => {
        let error = null;

        // Simulate error randomly
        if (Math.random() > 0.5) {
            error = "Network Error!";
        }

        if (error) {
            callback(error, null);
        } else {
            const response = "Data from " + url;
            callback(null, response);
        }
    }, 2000);
}

// Call function
fetchData("https://api.example.com", function(error, response) {
    if (error) {
        console.log("Error:", error);
    } else {
        console.log("Success:", response);
    }
});