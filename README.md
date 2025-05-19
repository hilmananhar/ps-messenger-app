# PS Messenger App

**PS Messenger App** is an Android-based messaging application that leverages Firebase services for real-time communication, authentication, and cloud storage. This project serves as a foundational template for building secure and scalable chat applications.

---

## ✨ Features

- **Real-Time Messaging** – Instant communication between users using Firebase Realtime Database.
- **User Authentication** – Secure sign-in and sign-up processes via Firebase Authentication.
- **Cloud Storage** – Upload and retrieve media files using Firebase Cloud Storage.
- **Push Notifications** – Receive alerts for new messages through Firebase Cloud Messaging (FCM).

---

## 🚀 Getting Started

### Prerequisites

- [Android Studio](https://developer.android.com/studio) installed on your development machine.
- A [Firebase](https://firebase.google.com/) account with a new project set up.

### Installation

1. **Clone the Repository**

   ```bash
   git clone https://github.com/hilmananhar/ps-messenger-app.git
   ```
   
3. Open in Android Studio
- Launch Android Studio.
- Select File > Open and navigate to the cloned project folder.
3. Configure Firebase
- In the Firebase Console, create a new project.
- Add an Android app to your Firebase project using your app’s package name.
- Download the google-services.json file and place it in the app/ directory of the project.
4. Update Firebase Storage Rules (for development)
  ⚠️ Do not use this configuration in production.

  ```bash
  service firebase.storage {
    match /b/{bucket}/o {
      match /{allPaths=**} {
        allow read, write: if true;
      }
    }
  }
  ```
  
5. Set Up Firebase Cloud Messaging (FCM)
- Go to Project Settings > Cloud Messaging in Firebase Console.
- Copy your Server key.
- In your project, locate the file where the FCM server key is defined (e.g., Constants.java) and replace:

  ```java
  public static final String FCM_SERVER_KEY = "YOUR_SERVER_KEY_HERE";
  ```
  
6. Change the Package Name (Optional but recommended)
- Right-click on the package directory in app/java/, then choose Refactor > Rename.
- Update the package name in AndroidManifest.xml and build.gradle as well.
