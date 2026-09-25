# nLogin Premium v2.0.19

> **A practical, secure, and player-friendly authentication system for Minecraft servers.**

---

## 📖 Overview

**nLogin** is an advanced authentication and account management system designed for Minecraft networks. It delivers rock-solid security, high performance, and an intuitive user experience for both players and administrators.

**nLogin Premium** includes exclusive enterprise-grade features such as multi-platform account linking, seamless session caching, Bedrock auto-login, multi-proxy architecture, and built-in protection mechanisms.

---

## ⭐ Premium Features

### 🔗 Account Linking (Email, Discord & Twitter)
Allow your players to connect their social and communication profiles directly to their Minecraft accounts:
- **Two-Factor Authentication (2FA)**: Adds an essential secondary layer of protection using Email, Discord, or Twitter/X.
- **Self-Service Password Recovery**: Players can restore forgotten passwords directly through their linked accounts without requiring staff intervention.
- **Ecosystem Integration**: Connect player credentials to forums, web stores, Discord roles, and community portals.
- **Mandatory Email Verification**: Force new players to verify a valid email upon registration, preventing bot raids, disposable accounts, and alternate account abuse.
- **Account Limiter**: Restrict registrations per IP address (defaults to 1 account per IP, fully configurable with bypass permissions).

### ⚡ Seamless & Convenient Authentication
- **Login Sessions**: Cracked/offline players do not need to re-type their passwords repeatedly on every reconnect. Sessions persist for a configurable duration (default: 5 minutes in `config.yml`).
- **Premium Auto-Login (Mojang / Microsoft)**: Automatically recognizes authentic premium accounts and logs them in instantly without prompting for a password—even on their very first join!
- **Bedrock Auto-Login (Geyser & Floodgate)**: Players connecting from Minecraft Bedrock Edition (iOS, Android, Windows 10/11, Consoles) are verified automatically without manual password entry.

### 🛡️ Security & Performance
- **Modern Password Hashing**: Supports state-of-the-art cryptographic algorithms including **Argon2** (configurable iterations, memory, parallelism), **BCrypt** (configurable rounds), PBKDF2, and SHA-256.
- **High-Risk Command Lockdown**: Automatically disables sensitive in-game administrative commands to protect servers from hijacked staff accounts or compromised operator privileges.
- **Anti-Brute-Force & Rate Limiting**: Built-in IP limiter and rate-limiting protect authentication endpoints from dictionary attacks.
- **Full Proxy & BungeeGuard+ Support**: Native integration with BungeeCord, Waterfall, and Velocity. Built-in BungeeGuard authentication prevents malicious players from bypassing your proxy.
- **AuthMe API Compatibility**: Fully compatible with any third-party plugin that hooks into the AuthMe Reloaded API.
- **Database Migration Tools**: Effortlessly convert existing player databases from other authentication plugins (AuthMe, LogIt, xAuth, etc.).
- **Automatic Language Detection**: Features 26+ built-in languages (including English, Vietnamese, Spanish, Portuguese, Russian, German, French, etc.) with automatic client-language matching.

---

## 🛠️ Complete Build Guide

This project is a clean, modern Maven project that builds into a self-contained, standalone `.jar` ready for deployment on any modern Minecraft server or proxy network.

### 📋 Prerequisites
Ensure your build environment meets the following requirements:
- **Java Development Kit (JDK)**: JDK 17 or higher (tested and 100% compatible with JDK 17, 21, and Java 25).
- **Apache Maven**: Version 3.8.0 or higher.
- **Git**: Installed and configured.

### 📥 1. Clone the Repository
```bash
git clone https://github.com/bb99kra/nLogin-Premium-Source.git
cd nLogin-Premium-Source
```

### ⚙️ 2. Project Structure
```text
nLogin-Premium-Source/
├── .github/
│   └── workflows/
│       └── build.yml          # Automated CI/CD GitHub Actions build
├── libs/
│   └── nlogin-dependencies.jar # Core libraries and dependencies
├── src/
│   ├── main/
│   │   ├── java/              # Clean deobfuscated Java source code
│   │   │   └── com/nickuc/login/
│   │   └── resources/         # Configurations, messages (26 languages), manifests
│   │       ├── com/nickuc/login/config/
│   │       ├── plugin.yml     # Spigot/Paper/Folia plugin manifest
│   │       ├── bungee.yml     # BungeeCord/Waterfall proxy manifest
│   │       └── velocity-plugin.json # Velocity proxy manifest
└── pom.xml                    # Maven configuration and build pipeline
```

### 🔨 3. Compile and Package
Run Maven to compile the source code, shade necessary libraries, and produce the final JAR:
```bash
mvn clean package -DskipTests
```

### 📦 4. Build Output
Upon successful compilation, Maven creates the final production binary at:
```text
target/nLogin-2.0.19.jar
```
This `.jar` contains the complete platform loaders for Paper/Spigot, BungeeCord, and Velocity, along with all configurations and shaded dependencies.

### 🤖 5. Automated CI/CD (GitHub Actions)
Every `git push` to the `main` branch automatically triggers the `.github/workflows/build.yml` workflow, compiling the project on Ubuntu runners with Temurin JDK 17 and uploading the compiled `nLogin-2.0.19.jar` as a downloadable GitHub artifact.

---

## 🚀 Server Installation

1. Stop your Minecraft server or proxy.
2. Copy `nLogin-2.0.19.jar` into the `plugins/` directory of your server.
3. Start the server to generate configuration files in `plugins/nLogin/`.
4. Configure your database (`MySQL`, `MariaDB`, `PostgreSQL`, or `SQLite`/`H2`) in `plugins/nLogin/config.yml`.
5. Run `/nlogin reload` or restart the server to apply changes.

---

## 🛡️ BungeeGuard+ Setup Guide

BungeeCord and Velocity proxy setups require proper handshake security to prevent attackers from directly connecting to your backend servers with spoofed UUIDs or usernames.

### Why BungeeGuard?
Traditional firewall rules (`iptables` / `ufw`) can be complex to configure on shared hosting environments. BungeeGuard adds a cryptographically secure token to every proxy-to-backend handshake, rejecting unauthorized connections instantly.

### 1. On Your Proxy
- **BungeeCord / Waterfall**:
  1. Set `ip_forward: true` in your BungeeCord `config.yml`.
  2. Put `BungeeGuard.jar` into the proxy `plugins/` folder and restart.
  3. Open `plugins/BungeeGuard/token.yml` and copy your authentication token.
- **Velocity**:
  1. Ensure you run Velocity 1.1.0 or newer (BungeeGuard support is built-in).
  2. In `velocity.toml`, set `player-info-forwarding-mode = "bungeeguard"`.
  3. Set `forwarding-secret` to a secure secret token and note it down.
  4. Restart Velocity.

### 2. On Your Backend Servers (Spigot / Paper)
1. In `spigot.yml`, set `bungeecord: true`.
2. Install `BungeeGuard.jar` in `plugins/` and restart the backend server.
3. Open `plugins/BungeeGuard/config.yml` and add your proxy token:
   ```yaml
   allowed-tokens:
     - "YOUR_PROXY_SECRET_TOKEN_HERE"
   ```
4. Run `bungeeguard reload` from the server console.

---

## 🎮 Commands & Permissions

### Player Commands
| Command | Aliases | Description | Permission |
| :--- | :--- | :--- | :--- |
| `/register <password> <confirm>` | `/reg` | Register an account password | Default |
| `/login <password>` | `/l`, `/log` | Authenticate with your password | Default |
| `/changepassword <old> <new>` | `/changepass` | Change your current password | Default |
| `/2fa` | — | Configure two-factor authentication | `nlogin.2fa` |
| `/premium` | — | Mark account as authentic Mojang Premium | Default |
| `/cracked` | — | Revert account to offline/cracked mode | Default |
| `/unregister` | — | Unregister account (disabled by default) | `nlogin.command.nlogin.unregister` |

### Administration Commands
| Command | Description | Permission |
| :--- | :--- | :--- |
| `/nlogin` | Main administrative command menu | `nlogin.admin` |
| `/nlogin version` | Displays detailed plugin version and build information | `nlogin.admin` |
| `/nlogin support` | Shows official support channels and contact links | `nlogin.admin` |
| `/nlogin reload` | Reloads all configuration and language files | `nlogin.admin` |
| `/nlogin changepass <player> <password>` | Manually changes a player's password | `nlogin.admin` |
| `/nlogin forcelogin <player>` | Forces a player into an authenticated state | `nlogin.admin` |
| `/nlogin unregister <player>` | Clears authentication data for a player | `nlogin.admin` |
| `/nlogin delete <player>` | Permanently deletes a player profile (UUID data lost) | `nlogin.admin` |
| `/nlogin dupeip <player\|IP>` | Lists all accounts associated with an IP address | `nlogin.dupeip` |
| `/nlogin verify <player>` | Inspects player authentication & linking status | `nlogin.verify` |
| `/nlogin unban <player>` | Unbans an account locked by brute-force protection | `nlogin.admin` |
| `/nlogin spawn <set\|teleport> <type>` | Manages auth spawn and lobby teleportation points | `nlogin.admin` |

### Permissions Overview
| Permission | Description | Default |
| :--- | :--- | :--- |
| `nlogin.admin` | Full administrative privileges, notifications, and commands | `op` |
| `nlogin.dupeip` | Allows checking shared IP addresses via `/nlogin dupeip` | `op` |
| `nlogin.verify` | Allows inspecting account verification details | `op` |
| `nlogin.discord` | Grants access to Discord 2FA verification | `true` |
| `nlogin.email` | Grants access to Email 2FA verification | `true` |
| `nlogin.twitter` | Grants access to Twitter 2FA verification | `true` |
| `nlogin.bypass.email` | Bypasses mandatory email registration requirement | `false` |
| `nlogin.bypass.discord` | Bypasses mandatory Discord verification requirement | `false` |

---

## ⚙️ Configuration Reference

### Security & Password Hashing (`config.yml`)
```yaml
# Supported hashing algorithms: ARGON2, BCRYPT, PBKDF2, SHA256
hash:
  algorithm: 'ARGON2'
  bcrypt:
    rounds: 10
  argon2:
    iterations: 10
    memory: 64
    parallelism: 1

security:
  # Account limiter per IP address
  address-limiter:
    enable: true
    limit: 1
    bypass:
      - '127.0.0.1'
      - 'localhost'
  # Maximum time to authenticate before being kicked (in seconds)
  time-to-login: 45
  # Lock high-risk administrative commands in-game to prevent hijacking
  disable-high-risk-commands: true
  # Nickname validation regex
  nickname-regex: '([a-zA-Z0-9_]{3,16})'
```

---

## 🌐 Supported Platforms & Compatibility
- **Server Engines**: Paper, Purpur, Folia, Spigot, Bukkit (1.13.x – 1.21.x+)
- **Proxy Engines**: Velocity (3.x+), BungeeCord, Waterfall, FlameCord
- **Java Environments**: Java 17, Java 21, Java 25 (LTS)
- **Bedrock Gateways**: GeyserMC & Floodgate (automatic recognition)

---

## 📄 License & Credits
- **Original Author**: NickUC (`www.nickuc.com`)
- **Maintained & Enhanced by**: Nguyendzvn
