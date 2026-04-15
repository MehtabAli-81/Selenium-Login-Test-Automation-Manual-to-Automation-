
# 🔍 Login Testing: From Manual Design to Selenium Automation

## 🧠 Why This Project Exists
Most beginners jump directly into Selenium without understanding testing fundamentals.

This project was built to follow the **correct QA approach**:
> First design the test → then automate it.


##  🧪 What Was Done
### 1️⃣ Manual Testing
A structured login test case was created covering:
- Valid login scenario
- Invalid login scenario
- Expected system behavior

### 2️⃣ Automation
The same test case was converted into Selenium automation using Java.
##⚙️ What This Project Actually Tests
The login functionality of a web application by verifying:

- Correct credentials → successful login
- Incorrect credentials → proper error handling
## 🧬 How It Works (Behind the Code)
The automation script performs:

- Browser launch
- Navigation to application
- Input simulation (username & password)
- Action execution (login click)
- Result validation using:
  - URL check
  - Error message extraction
## 🧩 Key Learning Highlights
This project is not about clicking buttons — it demonstrates:

- How manual test cases translate into code  
- How to validate success vs failure  
- How real-world testing logic is applied  
- Difference between positive & negative testing  
## 🛠 Tech Used
Java  
- Selenium WebDriver  
- Maven  

## 📁 Structure
tests/

└── LoginTest.java
## 🚦 Execution
- Successful login → redirected to inventory page  
- Failed login → error message captured and printed  


## 📌 What Makes This Different
Unlike typical beginner projects, this one:

✔ Starts from manual testing  
✔ Focuses on validation logic  
✔ Demonstrates failure handling  
✔ Follows real QA workflow 
## 🔮 Next Direction
This project can evolve into:

- Cross-browser testing  
- TestNG-based framework  
- Page Object Model (POM)  
- Automated reporting  
## 👨‍💻 Author Note
This project reflects a learning journey —  
from understanding *what to test* to learning *how to automate it properly*