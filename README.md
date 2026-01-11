
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Java Collections & Generics Portfolio</title>
    <style>
        :root {
            --primary: #2563eb;
            --secondary: #64748b;
            --bg: #f8fafc;
            --card-bg: #ffffff;
            --text: #1e293b;
        }

        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background-color: var(--bg);
            color: var(--text);
            line-height: 1.6;
            margin: 0;
            padding: 20px;
        }

        .container {
            max-width: 1000px;
            margin: 0 auto;
        }

        header {
            text-align: center;
            padding: 40px 0;
            background: linear-gradient(135deg, #1e293b, #334155);
            color: white;
            border-radius: 15px;
            margin-bottom: 40px;
            box-shadow: 0 10px 15px -3px rgba(0,0,0,0.1);
        }

        h1 { margin: 0; font-size: 2.5rem; }

        .section-title {
            border-left: 5px solid var(--primary);
            padding-left: 15px;
            margin: 40px 0 20px;
            color: var(--primary);
        }

        .grid {
            display: grid;
            grid-template-columns: repeat(auto-fit, minmax(300px, 1fr));
            gap: 25px;
        }

        .card {
            background: var(--card-bg);
            border-radius: 12px;
            overflow: hidden;
            box-shadow: 0 4px 6px -1px rgba(0,0,0,0.1);
            transition: transform 0.3s ease;
        }

        .card:hover {
            transform: translateY(-5px);
        }

        .image-container {
            overflow: hidden;
            background: #000;
            height: 200px;
        }

        /* IMAGE DECORATION & FILTERS */
        .card img {
            width: 100%;
            height: 100%;
            object-fit: cover;
            filter: grayscale(80%) contrast(120%); /* Initial Filter */
            transition: all 0.5s ease;
        }

        .card:hover img {
            filter: grayscale(0%) brightness(110%); /* Hover Effect */
            scale: 1.1;
        }

        .card-content {
            padding: 20px;
        }

        .tag {
            display: inline-block;
            background: #dbeafe;
            color: #1e40af;
            padding: 4px 12px;
            border-radius: 20px;
            font-size: 0.8rem;
            font-weight: bold;
            margin-bottom: 10px;
        }

        code {
            background: #f1f5f9;
            padding: 2px 6px;
            border-radius: 4px;
            font-family: 'Courier New', Courier, monospace;
        }

        @media (max-width: 600px) {
            h1 { font-size: 1.8rem; }
            .grid { grid-template-columns: 1fr; }
        }
    </style>
</head>
<body>

<div class="container">
    <header>
        <h1>Java Backend Labs</h1>
        <p>Collections, Streams, & Generics Implementation</p>
    </header>

    <h2 class="section-title">I. Collections & Streams</h2>
    <div class="grid">
        <div class="card">
            <div class="image-container">
                <img src="https://github.com/user-attachments/assets/17f0a17e-f566-4460-8588-9e85f4158d6b" alt="Product Management">
            </div>
            <div class="card-content">
                <span class="tag">ArrayList</span>
                <h3>Manipulation de Produits</h3>
                <p>Gestion CRUD complète pour une liste de produits utilisant <code>ArrayList</code>.</p>
                <ul>
                    <li>Recherche par nom</li>
                    <li>Persistance en mémoire</li>
                </ul>
            </div>
        </div>

        <div class="card">
            <div class="image-container">
                <img src="https://github.com/user-attachments/assets/2eddaf22-d157-4ea8-83e9-3d208dd7b1ef" alt="Grades Management">
            </div>
            <div class="card-content">
                <span class="tag">HashMap</span>
                <h3>Gestion des Notes</h3>
                <p>Système de suivi d'étudiants utilisant des paires Clé/Valeur.</p>
                <ul>
                    <li>Calcul de moyenne/min/max</li>
                    <li>Lambdas & Stream API</li>
                </ul>
            </div>
        </div>

        <div class="card">
            <div class="image-container">
                <img src="https://github.com/user-attachments/assets/710e3987-5c13-45e0-8db8-7e488e69409c" alt="Set Operations">
            </div>
            <div class="card-content">
                <span class="tag">HashSet</span>
                <h3>Groupes d'Étudiants</h3>
                <p>Logique d'ensembles mathématiques appliquée aux collections Java.</p>
                <ul>
                    <li>Intersection (retainAll)</li>
                    <li>Union (addAll)</li>
                </ul>
            </div>
        </div>
    </div>

    <h2 class="section-title">II. Generics</h2>
    <div class="grid">
        <div class="card">
            <div class="image-container">
                <img src="https://github.com/user-attachments/assets/1999f344-be1d-43b2-9ec0-96f6bf839e66" alt="Generic Storage">
            </div>
            <div class="card-content">
                <span class="tag">Generics</span>
                <h3>GenericStorage&lt;T&gt;</h3>
                <p>Une solution de stockage réutilisable pour n'importe quel type d'objet Java, garantissant la sécurité du typage à la compilation.</p>
            </div>
        </div>
    </div>
</div>

</body>
</html>