# Bot Control Android App

This is a complete Android project designed to build on GitHub Actions.

The current app is a control-panel prototype for an MT5 trading bot. It can start/stop the UI state and configure symbol, lot size, daily target and trailing stop.

Important: an Android app cannot directly run an MT5 `.mq5` Expert Advisor. For live trading, the app must communicate with an MT5 EA running on MT5/VPS through a secure API or another bridge.

## Build

GitHub Actions builds:

`app/build/outputs/apk/debug/app-debug.apk`

The workflow uses JDK 17, Gradle 8.9, checkout v4, setup-java v5, and upload-artifact v4.
