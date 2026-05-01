const result = document.getElementById("result");
const loader = document.getElementById("loader");

async function getUser() {

    const username = document.getElementById("username").value;

    if(username === "") {
        result.innerHTML = `<p class="error">Please enter username</p>`;
        return;
    }

    loader.style.display = "block";
    result.innerHTML = "";

    try {

        const response = await fetch(`https://api.github.com/users/${username}`);

        if(!response.ok) {
            throw new Error("User not found");
        }

        const data = await response.json();

        result.innerHTML = `
            <div class="card">
                <img src="${data.avatar_url}" alt="User Image">
                <h2>${data.name || "No Name"}</h2>
                <p><strong>Username:</strong> ${data.login}</p>
                <p><strong>Followers:</strong> ${data.followers}</p>
                <p><strong>Following:</strong> ${data.following}</p>
                <p><strong>Public Repos:</strong> ${data.public_repos}</p>
                <p><strong>Location:</strong> ${data.location || "Not Available"}</p>
                <a href="${data.html_url}" target="_blank">
                    <button>Visit Profile</button>
                </a>
            </div>
        `;

    } catch(error) {

        result.innerHTML = `
            <p class="error">${error.message}</p>
        `;

    } finally {

        loader.style.display = "none";
    }
}