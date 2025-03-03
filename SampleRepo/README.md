# Demo CI/CD Pipeline

This is a demo project for testing a **local CI/CD pipeline** using a CLI tool.

## 📌 Features

- **Simple Java program (`Main.java`)**
- **JUnit test (`TestMain.java`)**
- **Basic CI/CD pipeline (`.pipelines/pipeline.yaml`)** **pipeline name:** demo-ci-pipeline
- **Test pipeline (`.pipelines/test-pipeline.yaml`)****pipeline name:** test-pipeline
- **Git setup (`.gitignore`)**

## 🚀 Quick Start

### 1️⃣ Clone the Repository

```sh
git clone https://github.com/YiwenW312/cicdSample.git
cd SampleRepo
```

### 2️⃣ Run Pipeline Locally

```sh
xx run --local --repo . --pipeline demo-ci-pipeline
```

### 3️⃣ Check Reports

```sh
xx report --repo .
```

## 📂 Project Structure

```
/demo-repo
  ├── src/                     # Java source files
  │   ├── Main.java             # Main application
  │   ├── TestMain.java         # JUnit test
  ├── .gitignore                # Ignore unnecessary files
  ├── .pipelines/               # CI/CD pipeline configurations
  │   ├── pipeline.yaml         # Main pipeline
  │   ├── test-pipeline.yaml    # Test pipeline
  ├── README.md                 # Documentation
```

---

**🎯 Ready to test? Run the pipeline and check execution logs!** 🚀

```
xx run --local --repo . --pipeline demo-ci-pipeline
```

---

## **📌 Final Steps**

### **✅ 1️⃣ Initialize a Local Repo**

```sh
mkdir demo-repo && cd demo-repo
git init
```

### **✅ 2️⃣ Create Java Files**

```sh
mkdir -p src
touch src/Main.java src/TestMain.java
```

### **✅ 3️⃣ Create `.pipelines` Directory**

```sh
mkdir .pipelines
touch .pipelines/pipeline.yaml .pipelines/test-pipeline.yaml
```

### **✅ 4️⃣ Commit to Git**

```sh
git add .
git commit -m "Initial commit with pipeline setup"
```

