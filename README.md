# Random Password Generator

*A Java CLI password generator using SecureRandom, guaranteeing at least one lowercase letter, uppercase letter, digit, and symbol. A project made while bored in class.*
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
Security depends on length; the longer the password, the more secure it is.

## Features

- **Length check:** Passwords generated must have at least 8 characters. Otherwise, the user will be asked to provide input again.
- **Ensures a combination of characters:** As mentioned in the about section, it will always have at least 1 Uppercase and 1 lowercase letter, 1 symbol, and 1 Digit in the generation of the password.
- **Use of SecureRandom for security:** SecureRandom uses a Cryptographically Secure Pseudo-Random Number Generator (CSPRNG) to ensure each password generation is secure enough for the user.

## Demo

Generation of a password:

<img width="614" height="68" alt="image" src="https://github.com/user-attachments/assets/ab3bca7d-9476-433e-aaaf-cd0ec0ea4b0e" />

Test cases (only numeric input, minimum length)

<img width="645" height="178" alt="image" src="https://github.com/user-attachments/assets/69094eb9-56c0-4d6d-869e-3ef4463b5a30" />

## Getting Started

### Prerequisites

- JDK 17 or newer

### Build and Run

```bash
# open your terminal
# use cd to go to the folder of the app, then go inside of src. Then compile and run
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
| n >= 8 (any number) | a randomly generated password made of n characters greater or equal than 8 |
| "abc" | Please enter a number |
| any number less than 8 | Your password must be at least 8 characters long! |

---

Made by [Daniel Cuevas](https://github.com/iFHOX)
