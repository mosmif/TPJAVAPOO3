# 📘 Compte Rendu — TP3

**Module :** UML Java  
**Filière :** SDIA1  
**Étudiant :** **Mustapha Elmifdali**

---

## 🎯 Objectifs du TP

* Manipuler les **Collections Java** (List, Map, Set).
* Utiliser les **Streams** et les **lambda expressions**.
* Comprendre et appliquer les **Génériques**.
* Mettre en pratique des opérations **CRUD**.

---

## 🟦 I. Collections & Streams

### 1️⃣ Manipulation d’une List de produits

**🧩 Problème**
Créer une application permettant de gérer une liste de produits :

* Ajout
* Suppression
* Modification
* Affichage
* Recherche par nom

**✅ Solution implémentée**

* Classe `Product` :

  * `id : long`
  * `name : String`
  * `price : double`
* Utilisation de `ArrayList<Product>`
* Implémentation des opérations CRUD
* Recherche par nom via la saisie utilisateur

**▶️ Exécution**

<p align="center">
  <img src="https://github.com/user-attachments/assets/17f0a17e-f566-4460-8588-9e85f4158d6b" width="85%" style="border-radius:14px; box-shadow:0 10px 25px rgba(13,110,253,0.25); filter:contrast(110%) saturate(120%) brightness(105%);" />
</p>

---

### 2️⃣ Gestion des notes avec HashMap

**🧩 Problème**
Gérer les notes des étudiants avec :

* Nom de l’étudiant (clé)
* Note (valeur)

**✅ Solution implémentée**

* Structure : `HashMap<String, Double>`
* Opérations réalisées :

  * Ajout / Modification
  * Suppression
  * Taille de la collection
  * Calcul de la moyenne
  * Note minimale et maximale
  * Vérification de la présence de 20/20
* Affichage avec `forEach` et expressions lambda

**▶️ Exemple d’exécution**

<p align="center">
  <img src="https://github.com/user-attachments/assets/2eddaf22-d157-4ea8-83e9-3d208dd7b1ef" width="85%" style="border-radius:14px; box-shadow:0 10px 25px rgba(25,135,84,0.25); filter:grayscale(5%) contrast(115%) brightness(103%);" />
</p>

---

### 3️⃣ Ensembles (HashSet) — Groupes d’étudiants

**🧩 Problème**
Gérer deux groupes d’étudiants et afficher :

* L’intersection
* L’union

**✅ Solution implémentée**

* Deux `HashSet<String>`
* Méthode `retainAll()` pour l’intersection
* Méthode `addAll()` pour l’union

**▶️ Exemple d’exécution**

<p align="center">
  <img src="https://github.com/user-attachments/assets/710e3987-5c13-45e0-8db8-7e488e69409c" width="85%" style="border-radius:14px; box-shadow:0 10px 25px rgba(111,66,193,0.25); filter:brightness(108%) contrast(105%);" />
</p>

---

## 🟪 II. Generics

### 1️⃣ Classe générique `GenericStorage<T>`

**🧩 Problème**
Créer une classe générique capable de stocker et manipuler n’importe quel type d’objet.

**✅ Solution implémentée**

* Classe `GenericStorage<T>`
* Méthodes génériques pour :

  * Ajouter un élément
  * Supprimer un élément
  * Rechercher par identifiant
  * Afficher tous les éléments

**📋 Exemple — Gestion des produits**

```
**************************************************
        GESTION DES PRODUITS
**************************************************
1. Afficher tous les produits
2. Rechercher un produit par id
3. Ajouter un nouveau produit
4. Supprimer un produit (par id)
5. Quitter
→ Votre choix :
```

**▶️ Exécution**

<p align="center">
  <img src="https://github.com/user-attachments/assets/1999f344-be1d-43b2-9ec0-96f6bf839e66" width="85%" style="border-radius:14px; box-shadow:0 10px 25px rgba(255,193,7,0.3); filter:contrast(115%) saturate(110%);" />
</p>

<p align="center">
  <img src="https://github.com/user-attachments/assets/6a79a029-6e06-410d-aea7-836286ed5ca0" width="85%" style="border-radius:14px; box-shadow:0 10px 25px rgba(220,53,69,0.25); filter:sepia(8%) brightness(102%);" />
</p>

---

## ✅ Conclusion

Ce TP a permis de renforcer la compréhension :

* Des collections Java (`List`, `Map`, `Set`)
* Des expressions lambda et streams
* Des classes génériques

Il constitue une base solide pour le développement d’applications Java structurées et maintenables.

---

📌 *Réalisé par **Mustapha Elmifdali** — SDIA1*
