# Proxy & Flyweight Patterns Implementation

## Overview
This project demonstrates the use of the **Proxy Pattern** and the **Flyweight Pattern** in Java.

- **Proxy Pattern** is used for an image management system, where high-resolution images are loaded only when required.
- **Flyweight Pattern** is used for optimizing a map application by reusing marker styles.

---

## 1. Proxy Pattern (Image Management System)
### **Problem:**
Real estate agents upload high-resolution images, but loading them immediately can slow down the website.

### **Solution:**
- **Proxy Image**: Displays a low-resolution thumbnail quickly.
- **Real Image**: Loads high-resolution images only when the user requests.
- **Protection Proxy**: Ensures that only authorized agents can upload or replace images.

### **Implementation:**
- `Image` (Interface) - Defines `displayThumbnail()` and `displayFullImage()` methods.
- `RealImage` - Loads and displays high-resolution images.
- `ProxyImage` - Displays a thumbnail immediately and loads full image only when needed.
- `ProtectionProxyImage` - Restricts full image access to authorized users.

---

## 2. Flyweight Pattern (Map Application)
### **Problem:**
A map application needs to render thousands of location markers (e.g., hospitals, restaurants). Creating a new object for each marker is memory-intensive.

### **Solution:**
- **Flyweight Pattern** allows reusing marker styles instead of duplicating them.

### **Implementation:**
- `Marker` (Interface) - Defines `display(int x, int y)` method.
- `ConcreteMarker` - Represents a location marker.
- `MarkerFactory` - Stores and reuses existing marker styles to reduce memory usage.
---

## Project Structure
```
ProxyFlyweightProject/
│── src/
│   ├── proxy/
│   │   ├── Image.java
│   │   ├── RealImage.java
│   │   ├── ProxyImage.java
│   │   ├── ProtectionProxyImage.java
│   ├── flyweight/
│   │   ├── Marker.java
│   │   ├── ConcreteMarker.java
│   │   ├── MarkerFactory.java
│   ├── Main.java
│── README.md
│── .gitignore

```

