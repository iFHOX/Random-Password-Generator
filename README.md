# Random Password Generator

* A Java CLI password generator using SecureRandom, guaranteeing at least one lowercase letter, uppercase letter, digit, and symbol. A project made while bored in class.*
---

## Table of Contents

- [About](#about)
- [Features](#features)
- [Demo](#demo)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Build and Run](#build-and-run)
- [Usage](#usage)

---

## About

As the name suggests, this is a random password generator that runs in the terminal. By prompting the user to input a number to generate a password with at least one of the following items:
- 1 Uppercase letter.
- 1 Lowercase letter.
- 1 Symbol.
- 1 Digit
This project ensures the password generated is secure by using SecureRandom. Unlike Math.random(), whose output can be predicted from observed values, SecureRandom is designed to be unpredictable.
Security depends on length; the longer the password (like 8-12 characters), the more secure it is.

## Features

- **Length check:** Passwords generated must have at least 4 characters. Otherwise, the user will be asked to provide input again.
- **Ensures combination of characters:** As mentioned in the about section, it will always have at least 1 Uppercase and Lowercase letters, 1 Symbol and 1 Digit in the generation of the password.
- **Use of SecureRandom for security:** SecureRandom uses a Cryptographically Secure Pseudo-Random Number Generator (CSPRNG) to ensure each password generation is secure enough for the user.

## Demo

Generation of a password:

<img width="637" height="64" alt="image" src="https://github.com/user-attachments/assets/c84e83a8-074e-47a6-b7ba-e9992333d530" />

Test cases (only numeric input, minimum length)

<img width="651" height="172" alt="image" src="https://github.com/user-attachments/assets/0611dadc-4692-4efc-b715-88cec859edee" />

## Getting Started

### Prerequisites

- JDK 17 or newer

### Build and Run

```bash
# compile
javac Main.java

# run
java Main
```

## Usage

The moment you run the app, you are welcomed by the following message:
How many characters long do you want your random password to be?
You have a couple of inputs to choose from, with their respective feedback:

| Input | Expected result |
|-------|-----------------|
| n >= 4 (any number) | a randomly generated password made of n characters greater than 4 |
| "abc" | Please enter a number |
| any number less than 4 | Your password must be at least 4 characters long! |

---

Made by [Daniel Cuevas](https://github.com/iFHOX)
