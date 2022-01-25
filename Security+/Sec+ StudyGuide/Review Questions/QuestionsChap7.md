Chapter 7 Cryptography and the Public Key Infrastructure Review Questions

1- Mike is sending David an encrypted message using a symmetric encryption algoritm. What key should he use to encrypt the message?

A. Mike's public key

B. Mike's private key

C. David's public key

D. Shared secret key

1. D. In symmetric encryption algorithms, both the sender and the receiver use a shared secret key to encrypt and decrypt the message, respectively.

2- Alan's team needs to perform computations on sensitivepersonal information but does not need access to the underlying data. What technology can the team use to perform these calculations without accessing the data?

A. Quantum computing

B. Blockchain

C. Homomorphic encryption

D. Certificate pinning

2. C. Homomorphic encryption technology protects privacy by encrypting data in a way that preserves the ability to perform computation on that data.

3- Norm is using full-disk encryption technology to protect the contents of laptops against theft. What goal of cryptography is he attempting to achieve?

A. Integrity

B. Nonrepudiation

C. Authentication

D. Confidentiality

3. D. Norm's actions are designed to protect against the unauthorized disclosure of sensitive information. This is a clear example of protecting confidentiality.

4- Brian discovers that a user suspected of stealing sensitive information is posting many image files to a message board. What technique might the individual be using to hide sensitive information in those images?

A. Steganography

B. Homomorphic encryptionC. Replay attack

D. Birthday attack

4. A. Steganography is the art of using cryptographic techniques toembed secret messages within another file.
 
5- Which one of the following statements about cryptographic keys is incorrect?

A. All cryptographic keys should be kept secret.

B. Longer keys are better than shorter keys when the same algorithm is used.

C. Asymmetric algorithms generally use longer keys than symmetric algorithms.

D. Digital certificates are designed to share public keys.

5. A. All of these statements are correct except for the statement that all cryptographic keys should be kept secret. The exception to this rule are public keys used in asymmetric cryptography. These keys should be freely shared.

6- What type of cipher operates on one character of text at a time?

A. Block cipher

B. Bit cipher

C. Stream cipher

D. Balanced cipher

6. C. Stream ciphers operate on one character or bit of a message (or data stream) at a time. Block ciphers operate on “chunks,” or blocks, of a message and apply the encryption algorithm to an entire message block at the same time.

7- Vince is choosing a symmetric encryption algorithm for use in his organization. He would like to choose the strongest algorithm from the choices below. What algorithm should he choose?

A. DES

B. 3DES

C. RSA

D. AES

7. D. AES is the successor to 3DES and DES and is the best choice for a symmetric encryption algorithm. RSA is a secure algorithm, but it is asymmetric rather than symmetric.

8- Kevin is configuring a web server to use digital certificates. What technology can he use to allow clients to quickly verify the status of that digital certificate without contacting a remote server?

A. CRL

B. OCSP

C. Certificate stapling

D. Certificate pinning

8. C. The Online Certificate Status Protocol (OCSP) provides real- time checking of a digital certificate's status using a remote server. Certificate stapling attaches a current OCSP response to the certificate to allow the client to validate the certificate without contacting the OCSP server. Certificate revocation lists (CRLs) are a slower, outdated approach to managing certificate status. Certificate pinning is used to provide an expected key, not to manage certificate status.

9- Acme Widgets has 10 employees and they all need the ability to communicate with one another using a symmetric encryption system. The system should allow any two employees to securely communicate without other employees eavesdropping. If an 11th employee is added to the organization, how many new keys must be added to the system?

A. 1

B. 2

C. 10

D. 11

9. C. When the 11th employee joins Acme Widgets, they will need a shared secret key with every existing employee. There are 10 existing employees, so 10 new keys are required.

10 Referring to the scenario in question 9, if Acme Widgets switched to an asymmetric encryption algorithm, how many keys would be required to add the 11th employee?

A. 1

B. 2

C. 10

D. 11

10. B. In an asymmetric encryption algorithm, each employee needs only two keys: a public key and a private key. Adding a new user to the system requires the addition of these two keys for that user, regardless of how many other users exist.

11- What type of digital certificate provides the greatest level of assurance that the certificate owner is who they claim to be?

A. DV

B. OV

C. UV

D. EV

11. D. Extended validation (EV) certificates provide the highest available level of assurance. The CA issuing an EV certificate certifies that they have verified the identity and authenticity of the certificate subject.

12- Glenn recently obtained a wildcard certificate for *. mydomain.com . Which one of the following domains would not be covered by this certificate?

A. mydomain.com

B. core.mydomain.com

C. dev. www.mydomain.com

D.mail.mydomain.com

12. C. Wildcard certificates protect the listed domain as well as all first-level subdomains. dev.www.mydomain com is a second-level subdomain of mydomain.com and would not be covered by this certificate.

13- Which one of the following servers is almost always an offline CA in a large PKI deployment?

A. Root CA

B. Intermediate CA

C. RA

D. Internal CA

13. A. Root CAs are highly protected and not normally used for certificate issuance. A root CA is usually run as an offline CA that delegates authority to intermediate CAs that run as online CAs.

14- Which one of the following certificate formats is closely associated with Windows binary certificate files?

A. DER

B. PEM

C. PFX

D. P7B

14. C. The PFX format is most closely associated with Windows systems that store certificates in binary format, whereas the P7B format is used for Windows systems storing files in text format.

15- What type of security solution provides a hardware platform for the storage and management of encryption keys?

A. HSM

B. IPS

C. SIEM

D. SOAR

15. A. Hardware security modules (HSMs) provide an effective way to manage encryption keys. These hardware devices store and manage encryption keys in a secure manner that prevents humans from ever needing to work directly with the keys.

16- What type of cryptographic attack attempts to force a user to reduce the level of encryption that they use to communicate with a remote server?

A. Birthday

B. Frequency

C. Downgrade

D. Rainbow table

16. C. A downgrade attack is sometimes used against secure communications such as TLS in an attempt to get the user or system to inadvertently shift to less secure cryptographic modes. The idea is to trick the user into shifting to a less secure version of the protocol, one that might be easier to break.

17- David would like to send Mike a message using an asymmetric encryption algorithm. What key should he use to encrypt the message?

A. David's public key

B. David's private key

C. Mike's public key

D. Mike's private key

17. C. When encrypting a message using an asymmetric encryption algorithm, the person performing the encryption does so using the recipient's public key.

18- When Mike receives the message that David encrypted for him, what key should he use to decrypt the message?

A. David's public key

B. David's private key

C. Mike's public key

D. Mike's private key

18. D. In an asymmetric encryption algorithm, the recipient of a message uses their own private key to decrypt messages that they receive.

19- If David wishes to digitally sign the message that he is sending Mike, what key would he use to create the digital signature?

A. David's public key

B. David's private key

C. Mike's public key

D. Mike's private key

19. B. The sender of a message may digitally sign the message by encrypting a message digest with the sender's own private key.

20- When Mike receives the digitally signed message from David, what key should he use to verify the digital signature?

A. David's public key

B. David's private key

C. Mike's public key

D. Mike's private key

20. A. The recipient of a digitally signed message may verify the digital signature by decrypting it with the public key of the individual who signed the message.
