# Random Password Generator

*A project made while bored in class*
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

As the name suggests, this is a random password generator that runs in the terminal. By prompting the user to input any number to generate a password with at least one of the following items:
- 1 Uppercase letter.
- 1 Lowercase letter.
- 1 Symbol.
- 1 Digit
This project ensures the password generated is secure by using SecureRandom. This is because, unlike Math.Random(), SecureRandom generates cryptographically secure numbers thanks to its 128-bit length, while Math.random() uses a 64-bit length.
With this approach, passwords are practically impossible to guess.

## Features

- **Length check:** Passwords generated must have at least 4 characters. Otherwise, the user will be asked to provide input again.
- **Ensures combination of characters:** As mentioned in the about section, it will always have at least 1 Uppercase and Lowercase letters, 1 Symbol and 1 Digit in the generation of the password.
- **Use of SecureRandom for security:** SecureRandom uses a 128-bit length with a Cryptographically Secure Pseudo-Random Number Generator (CSPRNG) to ensure each password generation is secure enough for the user.

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

Paragraph explaining how to use the project.

| Input | Expected result |
|-------|-----------------|
| n>4 (any number) | a randomly generated password made of n characters greater than 4 |
| "abc" | Please enter a number |
| any number less than 4 | Your password must be at least 4 characters long! |

---

Made by [Daniel Cuevas]([https://github.com/iFHOX])
