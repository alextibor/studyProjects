1- Angela has chosen to federate with other organizations to allow use of services that each organization provides. What role does Angela's organization play when they authenticate their users and assert that those users are valid to other members of the federation?

A. Service provider

B. Relying party

C. Authentication provider

D. Identity provider

1. D. Angela's organization is acting as an identity provider (IdP). Other members of the federation may act as a service provider or relying party when they allow her users to access their services. Authentication provider is not a named role in typical federation activities.

2- Which of the following technologies is the least effective means of preventing shared accounts?

A. Password complexity requirements

B. Requiring biometric authentication

C. Requiring one-time passwords via a token

D. Requiring a one-time password via an application

2. A. Password complexity requirements do not prevent sharing of complex passwords, making it the least effective option from the list. Biometric authentication measures will require the enrolled user to be there, although in some cases such as fingerprint systems, multiple users could each enroll a valid fingerprint for a single account. Both types of one-time passwords could be shared but make it harder and less convenient to share accounts.

3- What major difference is likely to exist between on-premises identity services and those used in a cloud-hosted environment?

A. Account policy control will be set to the cloud provider's standards.

B. The cloud service will provide account and identity management services.

C. Multifactor authentication will not be supported by the cloud vendor.

D. None of the above.

3. B. Most cloud services provide identity and authorization tools for their services. Most, although not all, allow customers to set some or even many of the account policies they will use, and most major vendors support some form of multifactor capability.

4- Elaine wants to implement an AAA system. Which of the following is an AAA system she could implement?

A. RADIUS

B. SAML

C. OAuth

D. LDAP

4. A. Of all the listed options, only RADIUS is an authentication, authorization, and accounting service.

5- Which type of multifactor authentication is considered the least secure?

A. HOTP

B. SMS

C. TOTP

D. Biometric

5. B. SMS messages are not secure and could be accessed by cloning a SIM card or redirecting VoIP traffic, among other possible threat models. Both HOTP and TOTP tokens and applications as well as biometric factors are generally considered more secure than an SMS-based factor.

6- Samantha wants to set an account policy that ensures that devices can be used only while the user is in the organization's main facility. What type of account policy should she set?

A. Time of day

B. Geofencing

C. Time-based logins

D. Impossible travel time

6. B. Geofencing sets a geographic boundary that can be used as part of a ruleset. In this case, Samantha should set the ruleset to prevent devices from allowing users to use them when they are outside of the geofenced area. Time-of-day limitations and time- based logins are both related account policies that are used to ensure that users cannot log in when they shouldn't be at work. This can prevent compromised credential reuse and insider threat abuses during off-hours. Finally, impossible travel time is a type of geographic login data usage that maps when logins occur and compares them to the distance between them. If thetime is impossible, with a login in China 5 minutes after one in the United States, for example, the login may be reported and stopped.

7- Michelle enables the Windows 10 picture password feature to control logins for her laptop. Which type of attribute will it provide?

A. Somewhere you are

B. Something you can do

C. Something you exhibit

D. Someone you know

7. B. Picture password asks users to click on specific, self-defined parts of a picture. This means that clicking on those points is something you can do. Somewhere you are involves a location, something you exhibit is typical of personality traits, and someone you know would involve a third party, which can be useful for verification when someone can't otherwise prove their identity!

8-  What is a HSM used for?

A. To capture biometric enrollment data

B. To generate, manage, and securely store cryptographic keys

C. To generate one-time passwords via a time-based code algorithm

D. To enable federation between organizations

8. B. Hardware security modules (HSMs) are used to create, securely store, and manage digital signatures, cryptographic key pairs, and other cryptographic functions. They are not used for biometric enrollment data, to enable federation, or to generate one-time passwords.

9- Theresa wants to implement an access control scheme that sets permissions based on what the individual's job requires. Which of the following schemes is most suited to this type of implementation?

A. ABAC

B. DAC

C. RBAC

D. MAC

9. C. Role-based access control (RBAC) sets permissions based on an individual's role, which is typically associated with their job. Attribute-based access control (ABAC) is typically matched to attributes other than the job role. Discretionary access control (DAC) and mandatory access control (MAC) are commonly implemented at the operating system level.

10- Which of the following biometric technologies is most broadly deployed due to its ease of use and acceptance from end users?

A. Voice print recognition

B. Gait recognition

C. Retina scannersD. Fingerprint scanner

10. D. Fingerprint scanners are found on many mobile devices and laptops, making it one of the most broadly deployed biometric technologies. Facial recognition is also broadly deployed, but it is not offered as an option.

11- Charles has implemented LDAP for his organization. What type of service has he enabled?

A. A federation

B. A directory service

C. An attestation service

D. A biometric identity provider

11. B. LDAP, the Lightweight Directory Access Protocol, is an open industry standard for directory services. LDAP is not itself a federation or an attestation service, nor does it provide biometric authentication services.

12- A PIN is an example of what type of factor?

A. Something you know

B. Something you are

C. Something you have

D. Something you set

12. A. PINs and passwords are both examples of something you know. Something you set is not a type of factor. Biometric factors are an example of something you are, and a physical USB token would be a common example of something you have.

13- Melissa is planning on implementing biometric authenticationon her network. Which of the following should be a goal for any biometric solution she selects?

A. High FRR, low FAR

B. High FAR, low FRR

C. Low CER

D. High CER

13. C. A low crossover error rate will ensure that there's a low false rejection rate and a low false acceptance rate. The other options each have a high element, which isn't desirable.

14- What type of attack does an account lockout policy help to prevent?

A. Stolen password

B. Race conditions

C. Buffer overflows

D. Brute force

14. D. Account lockout policies lock out an account after a specific number of failed login attempts. This type of response helps to prevent brute-force attacks by stopping them from using repeated attempts until they can successfully log in.

15- Password complexity, password history, and password reuse are all examples of what?

A. Account auditsB. Account policies

C. Access policies

D. Credential attributes

15. B. Account policies include password complexity requirements; password history to prevent password reuse; and the time of day, geolocation, and similar settings that control elements of an account. Account audits check settings and account status. Access policies determine who can use systems or devices and other related items. Credential attributes is a made-up phrase for this question and the phrase does not appear in the Security+ exam outline.

16- Scott wants to allow users to bring their own credentials to his website so that they can log in using a Google or Microsoft account without giving him their passwords. What protocol can he use that will allow those users to grant the website access to their information?

A. Kerberos

B. OAuth

C. RADIUS

D. OpenID

16. D. OAuth is a protocol designed to allow users to grant third- party sites access to their information without providing that site with their password. It is typically used by OpenID identity providers to provide both authentication and authorization. Neither Kerberos nor RADIUS fits these requirements.

17- Trevor is deploying the Google Authenticator mobile application for use in his organization. What type of one-time password system does Google Authenticator use in its default mode?

A. HMAC-based one-time passwords

B. SMS-based one-time passwords

C. Time-based one-time passwords

D. Static codes

17. C. Google Authenticator implements time-based one-time passwords, with continuously generated codes provided to the user that expire and are refreshed on an ongoing basis.

18- Nina's organization uses SSH keys to provide secure accessbetween systems. Which of the following is not a common security concern when using SSH keys?

A. Inadvertent exposure of the private key

B. Weak passwords/passphrases

C. SSH key sprawl

D. Weak encryption

18. D. Inadvertent exposure of private keys via upload to a service like GitHub; poor handling of the private key in user directories; use of weak or reused passwords and passphrases; and key sprawl, in which keys are used broadly across an organization, are all common concerns. Weak encryption is not a typical concern with the use of SSH, since it implements modern strong encryption.

19- A person's name, age, location, or job title are all examples of what?

A. Biometric factors

B. Identity factorsC. Attributes

D. Account permissions

19. C. A person's name, age, location, job title, and even things like their height or hair color are all attributes that may be associated with a person's identity. None of these describe biometric factors used for authentication, and identity factors are something you know, something you are, or something you have. Account permissions determine what you can do, not attributes like these.

20- What type of access control scheme best describes the Linux filesystem?

A. MAC

B. RBAC

C. DAC

D. ABAC

20. C. Linux users can change who can read, write, or execute files and directories they own, which is discretionary access control(DAC). Mandatory access control (MAC) would enforce settings set by the systems administrator without users having the rights to make their own decisions. Rule-based access control (RBAC) and attribute-based access control (ABAC) are not a default method for setting rights for the Linux filesystem.