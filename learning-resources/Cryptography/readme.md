# Cryptography

## Overview

This is a complete Cryptography repository. That contains basic to advance detailed explanation of all cryptographic algorithms.

## Chapters :
 There are 3 main Chapters in this subject.

## Chapter - 1. Introduction to Cryptography
- Overview of cryptography and its importance in securing information.
- Explanation of classical and modern cryptographic techniques.

### Substitution Ciphers
-  Substitution Ciphers : Explanation of substitution ciphers, including the  Caesar cipher .
  - Each letter in plaintext is replaced by another letter based on a fixed shift.

###  AES (Advanced Encryption Standard)
-  AES Algorithm : Detailed discussion on the AES algorithm, including its structure and S-Box.
- Importance of AES in modern encryption practices.

### Data Structures in AES
- Description of the data structures used in AES for encryption and decryption processes.

### Network Security Models
- Framework for designing secure algorithms and protocols.
- Steps for generating and distributing secret keys for secure communication.

### Vigenère Cipher
-  Introduction to the Vigenère cipher : A method of encryption using a keyword.
- Explanation of how the cipher operates with a tabular method.

---

### Expected Outputs from this Chapter :

1.  Understanding of Cryptographic Principles :
   - Readers will gain foundational knowledge of how cryptography works and its applications.

2.  Knowledge of Classical and Modern Techniques :
   - Insights into various encryption methods, including substitution ciphers and block ciphers like AES.

3.  Implementation of AES :
   - Guidance on how to implement AES for secure data encryption.

4.  Security Protocol Design :
   - Framework for creating secure communication protocols and key management strategies.

5.  Practical Examples :
   - Examples of classical ciphers, such as the Caesar and Vigenère ciphers, to illustrate basic encryption concepts.
 
## Chapter 2 - Introduction to Public Key cryptography.

### Key Concepts:
    1. Primes and Prime Factorization
    2. Congruent modulo n 
    3. Integer modulo n 
    4. Multiplicative inverse 
    5. Relatively prime numbers 
    6. Euler's theorem 
    7. Fermat's Little Theorem 
    8. Extended Euclidean Algorithm 
    9. Chinese Remainder Theorem 

---

## Public Key Cryptography Mechanisms

### RSA (Rivest, Shamir, and Adleman) Algorithm
- Based on  exponentiation in finite fields .
- Security relies on the difficulty of factoring large numbers.
- Example of  RSA key generation process .

### Diffie-Hellman Key Exchange
- Explanation of how two parties can securely share a secret key over an insecure channel.

### Public Key Certificates
- Importance of certificates in verifying the  authenticity of public keys .

---

### Key Management

- Strategies for managing and distributing  public and private keys  securely.

---

### Elliptic Curve Cryptography (ECC)

- Introduction to  elliptic curves  and their advantages in cryptography.

---

### Case Study

- Application of public key cryptography in a real-world scenario:  Elan Financial Services .

---

### Public-Key Distribution

- Methods for distributing secret keys using  public key infrastructure (PKI) .

# Chapter 3 -Authentication and Hash Functions Summary

## 1. Authentication Requirements
- **Types of Attacks**:
  - Disclosure
  - Traffic Analysis
  - Masquerade
  - Content Modification
  - Sequence Modification
  - Timing Modification
  - Source Repudiation
  - Destination Repudiation

## 2. Authentication Functions
- **Message Authentication**:
  - Achieved through message encryption, Message Authentication Code (MAC), and hash functions.
- **Error Control**:
  - Internal error control ensures message integrity against unauthorized modifications.

## 3. Message Encryption
- **Symmetric Encryption**:
  - Provides both authentication and confidentiality by encrypting messages with a shared secret key.
- **Public Key Encryption**:
  - Ensures confidentiality but not authentication unless the sender’s private key is used.

## 4. Message Authentication Code (MAC)
- A MAC is generated using a secret key shared between the sender and receiver to ensure the authenticity and integrity of the message.

## 5. Hash Functions
- A hash function produces a fixed-length hash value from a message of any size and is used to ensure message integrity.
- **Requirements**:
  - Should be computationally infeasible to find two different messages with the same hash (collision resistance).

## 6. Secure Hash Algorithms (SHA)
- **SHA-1**:
  - Originally designed by NIST and NSA, produces a 160-bit hash value.
- **SHA-512**:
  - Involves padding, appending length, initializing hash buffers, and processing 1024-bit blocks for secure hashing.

## 7. MD5 Algorithm
- Produces a 128-bit message digest and is widely used despite concerns regarding brute force and cryptanalytic attacks.

## 8. HMAC (Hash-Based Message Authentication Code)
- Combines a cryptographic hash function (like MD5 or SHA) with a secret key for message authentication.

## 9. Digital Signatures
- Provides authentication, non-repudiation, and integrity.
- Ensures the signature is unique to both the message and the sender.

## 10. Authentication Protocols
- Used to verify identity and ensure secure key exchange.
- Prevents replay attacks and ensures confidentiality in communications.

---

# Expected Outputs
- Understanding of various authentication mechanisms (MACs, hash functions, digital signatures).
- Practical knowledge of encryption methods (symmetric, public key).
- Insight into key management strategies and attack prevention techniques.
 ---

    Please Download ppts for better Understanding


## Authors
**Contact contributor for any doubt or clearification**

- [Himanshu](https://www.linkedin.com/in/okay-anshu/)

