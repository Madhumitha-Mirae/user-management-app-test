import React, { useState, useEffect } from "react";

function App() {

  const [users, setUsers] = useState([]);
  const [name, setName] = useState("");
  const [email, setEmail] = useState("");

  // GET users
  const fetchUsers = async () => {

    const response = await fetch("http://localhost:8080/users");

    const data = await response.json();

    setUsers(data);
  };

  useEffect(() => {

    fetchUsers();

  }, []);

  // POST user
  const createUser = async () => {

    await fetch("http://localhost:8080/users", {

      method: "POST",

      headers: {
        "Content-Type": "application/json"
      },

      body: JSON.stringify({
        name: name,
        email: email
      })

    });

    fetchUsers();
  };

  return (

    <div>

      <h2>Create User</h2>

      <input
        placeholder="Name"
        onChange={(e) => setName(e.target.value)}
      />

      <input
        placeholder="Email"
        onChange={(e) => setEmail(e.target.value)}
      />

      <button onClick={createUser}>
        Create
      </button>

      <h2>User List</h2>

      <ul>
        {users.map(user => (
          <li key={user.id}>
            {user.name} - {user.email}
          </li>
        ))}
      </ul>

    </div>

  );
}

export default App;
