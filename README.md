# Suvham Shakya - Flutter Profile App

A Flutter application displaying my profile, configured with three flavors: `dev`, `staging`, and `prod` using `flutter_flavorizr`.

## About
- Displays my name (Suvham Shakya) and profile photo on the home screen
- Each flavor has a different app name and launcher icon
- Dev and staging flavors show a colored banner in the top-left corner

## Flavors

### Dev
- App Name: Suvham Dev
- Application ID: com.example.suvham_shakya_app.dev

### Staging
- App Name: Suvham Staging
- Application ID: com.example.suvham_shakya_app.staging

### Prod
- App Name: Suvham Shakya
- Application ID: com.example.suvham_shakya_app

## Setup

### Prerequisites
- Flutter SDK installed
- Android Studio installed
- Android emulator or physical device

### Installation
```bash
git clone https://github.com/Complex85362/flutter-my-profile-app.git
cd flutter-my-profile-app
flutter pub get
```

## Run Commands

### Dev flavor
```bash
flutter run --flavor dev -t lib/main_dev.dart
```

### Staging flavor
```bash
flutter run --flavor staging -t lib/main_staging.dart
```

### Prod flavor
```bash
flutter run --flavor prod -t lib/main_prod.dart
```