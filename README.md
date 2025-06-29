# goodies_distributor
A QR-code-based web application designed to streamline and digitize the distribution of goodies during organizational events such as hackathons, celebrations, and reward programs. Built using React, Java Spring Boot, and MongoDB, this system replaces manual, paper-based processes with fast, secure, and efficient digital verification.
🔍 Problem Statement
In traditional distribution setups:

Employees manually search their names in printed lists.

Each person spends ~2 minutes for verification and signing.

In events with ~500 employees:

500 × 2 min = 1000 minutes/day = 2 full working days lost daily

Over 5 days → 10 working days of productivity lost.

Manual tracking is error-prone, allows duplicate pickups, and lacks real-time visibility.

✅ Solution
This application introduces an automated goodies distribution flow:

Admin Interface

Create and manage events (e.g., Hackathon 2025)

Auto-generate a unique QR code per event

Monitor live distribution dashboard

Export goodies collection status as CSV

User Interface

Enter GPN (employee ID) to register

Scan event QR code using device camera

Confirmation message displayed

Duplicate scans are prevented automatically

💡 Features
🔐 Admin Login to securely manage events

📱 QR Scanner Integration (camera-based)

🎯 One-Time Collection Guarantee

📊 Real-Time Distribution Tracking

📤 CSV Export of Attendance Logs

🚀 Built with Modern Tech Stack

🧠 User-friendly, responsive UI

🛠 Tech Stack
Layer	Technology
Frontend	React, HTML5 QR Scanner
Backend	Spring Boot (Java)
Database	MongoDB
Others	CSV Export, PWA-ready, REST APIs
