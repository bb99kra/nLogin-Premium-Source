# nLogin Premium v2.0.19 (Reconstructed Project)

Dự án mã nguồn Java hoàn chỉnh được dịch ngược sạch và tái cấu trúc từ `nLogin Premium.jar`.

## 📌 Tổng quan kiến trúc
- **Tương thích đa nền tảng**:
  - Paper / Purpur / Folia (1.8.8 -> 1.21.x)
  - BungeeCord / Waterfall
  - Velocity Proxy (3.x)
- **Engine Core**:
  - `com.nickuc.login.api.*`: Toàn bộ Public API, Events, Types, Exceptions và Annotations.
  - `com.nickuc.login.loader.*`: Cơ chế Platform Bootstrap (`BukkitLoader`, `BungeeLoader`, `VelocityLoader`, `MemClassLoader`).
  - `com.nickuc.login.bukkit.*`: Cầu nối tích hợp Paper/Spigot.
  - `com.nickuc.login.proxy.*`: Cầu nối tích hợp Bungee/Velocity.
  - `com.nickuc.login.tasks.*`: Xử lý xác thực hàng đợi bất đồng bộ (Async Queue & Auth Tasks).
  - `patcher.*`: Các class decoupling bản quyền và nạp thư viện offline (`NLoginApiForge`, `NLoginDependencyBootstrap`).
- **Tài nguyên**:
  - Đầy đủ 26 ngôn ngữ cấu hình trong `src/main/resources/com/nickuc/login/config/` (kể cả Tiếng Việt `messages_vn.yml`).
  - File khóa công khai Yggdrasil session (`yggdrasil_session_pubkey.der`).
  - `plugin.yml`, `bungee.yml`, `velocity-plugin.json`.

## 🛠️ Biên dịch
```bash
mvn clean package
```
Tập tin JAR đầu ra sẽ được tạo tại thư mục `target/nLogin-2.0.19.jar`.
