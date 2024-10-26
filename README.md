<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>README - Microservices Project</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            color: #333;
            line-height: 1.6;
        }
        h1, h2, h3 {
            color: #007acc;
        }
        h1 {
            text-align: center;
        }
        h2 {
            border-bottom: 2px solid #007acc;
            padding-bottom: 5px;
        }
        code {
            background-color: #f4f4f4;
            padding: 2px 5px;
            border-radius: 3px;
            font-size: 1em;
        }
        ul {
            padding-left: 20px;
        }
        .logo {
            display: block;
            margin: 0 auto;
            width: 200px;
        }
        .highlight {
            color: #007acc;
            font-weight: bold;
        }
    </style>
</head>
<body>

<h1>🌐 Microservices Application with Spring Boot, JPA, PostgreSQL, and MySQL</h1>

<h2>📖 Project Overview</h2>
<p>This project is a <span class="highlight">microservices-based application</span> developed with <strong>Spring Boot</strong>, utilizing <strong>JPA</strong> for database interactions, and supporting <strong>PostgreSQL</strong> and <strong>MySQL</strong>. Each service is containerized for scalability and ease of deployment.</p>

<h2>📂 Project Structure</h2>
<p>The project is organized into different services, each with its specific function:</p>
<ul>
    <li><code>inventory-service</code>: Manages inventory data.</li>
    <li><code>orders-service</code>: Handles orders and transactions.</li>
    <li><code>products-service</code>: Manages product-related information.</li>
</ul>

<h2>🚀 Technologies Used</h2>
<ul>
    <li><span class="highlight">Spring Boot</span> - Main framework for service creation and management.</li>
    <li><span class="highlight">Spring Data JPA</span> - ORM for database interaction.</li>
    <li><span class="highlight">PostgreSQL & MySQL</span> - Databases for data persistence.</li>
    <li><span class="highlight">Docker</span> - Containerization of microservices for isolated and scalable environments.</li>
</ul>

<h2>🔧 Getting Started</h2>
<p>Follow these steps to set up the project on your local machine:</p>
<ol>
    <li><strong>Clone the repository:</strong> <code>git clone https://github.com/rpaternina/microservicios.git</code></li>
    <li><strong>Navigate to the project directory:</strong> <code>cd microservicios</code></li>
    <li><strong>Build and run the services with Docker:</strong> <code>docker-compose up</code></li>
</ol>

<h2>🌟 Features</h2>
<ul>
    <li>API endpoints for CRUD operations across services.</li>
    <li>Seamless integration with PostgreSQL and MySQL.</li>
    <li>High availability through containerized microservices.</li>
</ul>

<h2>💻 Usage</h2>
<pre><code>curl -X GET http://localhost:8080/api/v1/resource</code></pre>

<h2>📬 Contact</h2>
<p>Developed by <strong>Robert Paternina</strong>. Feel free to reach out for questions or collaboration opportunities:</p>
<ul>
    <li>Email: <a href="mailto:paterninayolir@gmail.com">paterninayolir@gmail.com</a></li>
    <li>LinkedIn: <a href="https://www.linkedin.com/in/robert-paternina/">Robert Paternina</a></li>
    <li>GitHub Repository: <a href="https://github.com/rpaternina/microservicios">microservicios</a></li>
</ul>

</body>
</html>
