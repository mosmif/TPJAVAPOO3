<div align="center">

# 🌌 TRANSMISSION RAPPORT TP3 🌌
### ════════════════════════════════════════
**MISSION MODULE:** `UML ⚡ JAVA`  
**SECTEUR ACADÉMIQUE:** `SDIA1 🎓`  
**AGENT OPÉRATEUR:** `✨ Mustapha Elmifdali ✨`

```
┌─────────────────────────────────────────┐
│   ██████╗ ███████╗██████╗  ██████╗ ██████╗ ████████╗   │
│   ██╔══██╗██╔════╝██╔══██╗██╔═══██╗██╔══██╗╚══██╔══╝   │
│   ██████╔╝█████╗  ██████╔╝██║   ██║██████╔╝   ██║      │
│   ██╔══██╗██╔══╝  ██╔═══╝ ██║   ██║██╔══██╗   ██║      │
│   ██║  ██║███████╗██║     ╚██████╔╝██║  ██║   ██║      │
│   ╚═╝  ╚═╝╚══════╝╚═╝      ╚═════╝ ╚═╝  ╚═╝   ╚═╝      │
└─────────────────────────────────────────┘
```

<img src="https://capsule-render.vercel.app/api?type=waving&color=gradient&customColorList=6,11,20&height=180&section=header&text=TP3%20JAVA%20ODYSSEY&fontSize=42&fontColor=fff&animation=twinkling&fontAlignY=32" width="100%"/>

</div>

---

## 🎯 OBJECTIFS DE MISSION

<table>
<tr>
<td width="50%" valign="top">

### 🔮 MODULES PRIMAIRES

```java
▸ Collections.nexus()
  ├─ List<T> ⟿ Dynamic Arrays
  ├─ Map<K,V> ⟿ Key-Value Pairs
  └─ Set<E> ⟿ Unique Elements
```

</td>
<td width="50%" valign="top">

### ⚛️ TECHNOLOGIES AVANCÉES

```java
▸ Streams.quantum()
  ├─ λ Lambda Expressions
  ├─ <T> Generics
  └─ CRUD Operations
```

</td>
</tr>
</table>

<div align="center">

### 🌠 ════════════════════════════════════════ 🌠

</div>

---

## 🟦 PHASE I: COLLECTIONS & FLUX QUANTIQUES

<div align="center">

```
╔═══════════════════════════════════════════════════════════╗
║                    🛸 SECTION ALPHA 🛸                    ║
║          MANIPULATION DES LISTES PRODUITS                 ║
╚═══════════════════════════════════════════════════════════╝
```

</div>

### 1️⃣ Module Gestion Produits

<table>
<tr>
<td width="50%">

#### 🧩 **PROBLÉMATIQUE**

Conception d'un système de gestion produits intégrant:

- 🔹 **Addition** de nouvelles entités
- 🔹 **Suppression** d'éléments obsolètes  
- 🔹 **Modification** des propriétés
- 🔹 **Affichage** complet du registre
- 🔹 **Recherche** par identifiant nominal

</td>
<td width="50%">

#### ✅ **ARCHITECTURE**

```java
class Product {
  🆔 id      : long
  📛 name    : String
  💰 price   : double
}
```

**Structure:** `ArrayList<Product>`  
**Opérations:** CRUD complet  
**Recherche:** Algorithme par nom

</td>
</tr>
</table>

#### ▶️ DÉMONSTRATION VISUELLE

<div align="center">

<img src="https://github.com/user-attachments/assets/17f0a17e-f566-4460-8588-9e85f4158d6b" width="88%" style="border-radius:18px; box-shadow:0 0 40px rgba(13,110,253,0.5), 0 0 80px rgba(13,110,253,0.3); border: 3px solid rgba(13,110,253,0.6); filter:contrast(115%) saturate(125%) brightness(108%) hue-rotate(2deg);" />

<sub>⚡ Interface de commande - Système de gestion produits ⚡</sub>

</div>

---

<div align="center">

```
╔═══════════════════════════════════════════════════════════╗
║                    🌟 SECTION BETA 🌟                     ║
║         SYSTÈME ÉVALUATION ACADÉMIQUE                     ║
╚═══════════════════════════════════════════════════════════╝
```

</div>

### 2️⃣ Module HashMap - Notes Étudiants

<table>
<tr>
<td colspan="2" align="center">

#### 🧩 **CHALLENGE TECHNIQUE**

Développement d'un système de gestion des évaluations académiques avec architecture clé-valeur

</td>
</tr>
<tr>
<td width="50%" valign="top">

#### ✅ **IMPLÉMENTATION**

```javascript
🗺️ HashMap<String, Double>
   ├─ Clé: Nom étudiant
   └─ Valeur: Note /20
```

**Opérations disponibles:**

- ➕ Ajout / Mise à jour
- ➖ Suppression d'entrée
- 📊 Calcul statistique
- 🔍 Recherche sélective

</td>
<td width="50%" valign="top">

#### 📈 **FONCTIONNALITÉS**

```java
stats.compute() {
  ▸ size()        // Taille
  ▸ moyenne()     // Moyenne
  ▸ min()         // Minimum
  ▸ max()         // Maximum
  ▸ contains(20)  // Parfait?
}
```

**Affichage:** λ Lambda + forEach

</td>
</tr>
</table>

#### ▶️ RÉSULTAT OPÉRATIONNEL

<div align="center">

<img src="https://github.com/user-attachments/assets/2eddaf22-d157-4ea8-83e9-3d208dd7b1ef" width="88%" style="border-radius:18px; box-shadow:0 0 40px rgba(25,135,84,0.5), 0 0 80px rgba(25,135,84,0.3); border: 3px solid rgba(25,135,84,0.6); filter:contrast(118%) saturate(122%) brightness(106%) hue-rotate(-3deg);" />

<sub>💚 Console opérationnelle - Module évaluation académique 💚</sub>

</div>

---

<div align="center">

```
╔═══════════════════════════════════════════════════════════╗
║                  🔮 SECTION GAMMA 🔮                      ║
║           ÉLIMINATION DES DOUBLONS                        ║
╚═══════════════════════════════════════════════════════════╝
```

</div>

### 3️⃣ Purification avec HashSet

<table>
<tr>
<td width="48%">

#### 🧩 **MISSION**

Extraction de noms uniques depuis une liste contenant des duplicatas

**Approche:**
- 📥 Input: `List<String>` avec doublons
- ⚙️ Process: Conversion `HashSet<String>`
- 📤 Output: Collection purifiée

</td>
<td width="4%"></td>
<td width="48%">

#### ✅ **MÉTHODE**

```java
Set<String> unique = 
    new HashSet<>(liste);

// Auto-élimination 
// des doublons ✨
```

**Propriété HashSet:**  
Garantie d'unicité native

</td>
</tr>
</table>

---

## 🟧 PHASE II: STREAMS & PARADIGMES AVANCÉS

<div align="center">

```
╔═══════════════════════════════════════════════════════════╗
║                  ⚡ EXERCICE DELTA ⚡                      ║
║              FLUX STREAMS APPLIQUÉS                       ║
╚═══════════════════════════════════════════════════════════╝
```

</div>

### 4️⃣ Application Stream - Liste Mots

<table>
<tr>
<td colspan="2" align="center" bgcolor="#1a1a2e">

#### 🎯 **OBJECTIFS MULTIPLES**

</td>
</tr>
<tr>
<td width="50%" valign="top">

**🔹 Opération A:** Filtrage  
Mots contenant `"a"` → Transformation MAJUSCULES

```java
.filter(m -> m.contains("a"))
.map(String::toUpperCase)
```

**🔹 Opération B:** Inversion  
Application de reverse() sur chaque mot

```java
.map(m -> new StringBuilder(m)
          .reverse().toString())
```

</td>
<td width="50%" valign="top">

**🔹 Opération C:** Sélection  
Mots avec `'e'` → Aplatissement caractères

```java
.filter(m -> m.contains("e"))
.flatMap(m -> Stream.of(
          m.split("")))
```

**🔹 Opération D:** Analyse  
Conversion chaînes → longueurs

```java
.map(String::length)
.collect(Collectors.toList())
```

</td>
</tr>
</table>

---

<div align="center">

```
╔═══════════════════════════════════════════════════════════╗
║                 🌊 EXERCICE EPSILON 🌊                    ║
║          TRAITEMENT EMPLOYÉS AVANCÉ                       ║
╚═══════════════════════════════════════════════════════════╝
```

</div>

### 5️⃣ Stream Pipeline - Entité Employé

#### 📦 **MODÈLE DE DONNÉES**

```java
class Employe {
    🆔 nom         : String
    👔 departement : String
    💵 salaire     : double
}
```

#### 🔧 **OPÉRATIONS IMPLÉMENTÉES**

<table>
<tr>
<td width="33%" align="center">

**Σ SOMME TOTALE**

```java
.mapToDouble(
  Employe::getSalaire)
.sum()
```

</td>
<td width="33%" align="center">

**📊 TRIAGE**

```java
.sorted(Comparator
  .comparing(
    Employe::getNom))
```

</td>
<td width="34%" align="center">

**🔍 MIN/MAX**

```java
.min/.max(
  Comparator
    .comparingDouble(
      ::getSalaire))
```

</td>
</tr>
<tr>
<td colspan="3" align="center">

**🎯 RÉDUCTION FONCTIONNELLE**

```java
.reduce(0.0, (acc, e) -> acc + e.getSalaire(), Double::sum)
```

</td>
</tr>
</table>

---

## 🟪 PHASE III: GÉNÉRICITÉ & MÉTAPROGRAMMATION

<div align="center">

```
╔═══════════════════════════════════════════════════════════╗
║                 🧬 SECTION OMEGA 🧬                       ║
║          INTERFACES & CLASSES GÉNÉRIQUES                  ║
╚═══════════════════════════════════════════════════════════╝
```

</div>

### 6️⃣ Interface Générique `IMetier<T>`

#### 🏗️ **ARCHITECTURE**

```java
interface IMetier<T> {
    ➕ T add(T o);
    📋 List<T> getAll();
    🔍 T findByNom(String nom);
    🗑️ void delete(String nom);
}
```

#### ⚙️ **IMPLÉMENTATION CONCRÈTE**

<table>
<tr>
<td width="50%">

**Classe:** `MetierProduitImpl`  
**Type:** `implements IMetier<Product>`

**Stockage interne:**
```java
List<Product> produits = 
    new ArrayList<>();
```

</td>
<td width="50%">

**Méthodes implémentées:**

- ✅ `add(Product p)` → Ajout
- ✅ `getAll()` → Liste complète
- ✅ `findByNom(String)` → Recherche
- ✅ `delete(String)` → Suppression

</td>
</tr>
</table>

---

<div align="center">

## 🌟 CONCLUSION & ACQUIS

```
╔════════════════════════════════════════════════════════════╗
║                    ✨ BILAN MISSION ✨                     ║
╚════════════════════════════════════════════════════════════╝
```

</div>

<table>
<tr>
<td width="50%" align="center">

### 🎓 COMPÉTENCES DÉVELOPPÉES

- ☑️ Maîtrise Collections Framework
- ☑️ Programmation fonctionnelle (λ)
- ☑️ Architecture générique
- ☑️ Patterns CRUD

</td>
<td width="50%" align="center">

### 🚀 TECHNOLOGIES MAÎTRISÉES

- ☑️ `Stream API`
- ☑️ `Lambda Expressions`
- ☑️ `Generics <T>`
- ☑️ `HashMap & HashSet`

</td>
</tr>
</table>

---

<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=gradient&customColorList=6,11,20&height=120&section=footer&animation=twinkling" width="100%"/>

### 🌌 FIN DE TRANSMISSION 🌌

```
████████████████████████████████████████████████████████
█                                                      █
█   ╔═══════════════════════════════════════════╗    █
█   ║  Mission accomplie avec succès            ║    █
█   ║  Rapport généré le 2026-01-25             ║    █
█   ║  Agent: Mustapha Elmifdali                ║    █
█   ╚═══════════════════════════════════════════╝    █
█                                                      █
████████████████████████████████████████████████████████
```

**⭐ Système opérationnel | Status: `OPTIMAL` ⭐**

<sub>Propulsé par ⚡ Java Stream API & Lambda Power 🚀</sub>

</div>
