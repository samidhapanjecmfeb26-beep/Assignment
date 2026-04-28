function fetchData(url, callback) {
    console.log("Fetching data from:", url);

    setTimeout(() => {
        const response = "Data received from " + url;
        callback(response);
    }, 2000); // 2 sec delay
}

// Call function
fetchData("https://api.example.com", function(response) {
    console.log(response);
});