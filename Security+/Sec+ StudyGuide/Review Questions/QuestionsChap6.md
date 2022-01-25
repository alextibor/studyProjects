Chapter 6: Secure Coding Review Questions

1- Adam is conducting software testing by reviewing the source code of the application. What type of code testing is Adam conducting?

A. Mutation testing

B. Static code analysis

C. Dynamic code analysis

D. Fuzzing

1. B. Adam is conducting static code analysis by reviewing the source code. Dynamic code analysis requires running the program, and both mutation testing and fuzzing are types of dynamic analysis.

2- Charles is worried about users conducting SQL injection attacks. Which of the following solutions will best address his concerns?

A. Using secure session management

B. Enabling logging on the database

C. Performing user input validation

D. Implementing TLS

2. C. Charles should perform user input validation to strip out any SQL code or other unwanted input. Secure session management can help prevent session hijacking, logging may provide useful information for incident investigation, and implementing TLS can help protect network traffic, but only input validation helps with the issue described.

3- Precompiled SQL statements that only require variables to be input are an example of what type of application security control?

A. Parameterized queries

B. Encoding data

C. Input validation

D. Appropriate access controls

3. A. A parameterized query (sometimes called a prepared statement) uses a prebuilt SQL statement to prevent SQL-based attacks. Variables from the application are fed to the query, rather than building a custom query when the application needs data. Encoding data helps to prevent cross-site scripting attacks, as does input validation. Appropriate access controls can prevent access to data that the account or application should not have access to, but they don't use precompiled SQL statements. Stored procedures are an example of a parameterized query implementation.

4- During a web application test, Ben discovers that the application shows SQL code as part of an error provided to application users. What should he note in his report?

A. Improper error handling

B. Code exposure

C. SQL injection

D. A default configuration issue

4. A. Improper error handling often exposes data to users and possibly attackers that should not be exposed. In this case, knowing what SQL code is used inside the application can provide an attacker with details they can use to conduct further attacks. Code exposure is not one of the vulnerabilities we discuss in this book, and SQL code being exposed does not necessarily mean that SQL injection is possible. While this could be caused by a default configuration issue, there is nothing in the question to point to that problem.

5- The application that Scott is writing has a flaw that occurs when two operations are attempted at the same time, resulting in unexpected results when the two actions do not occur in the expected order. What type of flaw does the application have?

A. De-referencing

B. A race condition

C. An insecure function

D. Improper error handling

5. B. The application has a race condition, which occurs when multiple operations cause undesirable results due to their order of completion. De-referencing would occur if a memory location was incorrect, an insecure function would have security issues in the function itself, and improper error handling would involve an error and how it was displayed or what data it provided.

6- Every time Susan checks code into her organization’s code repository, it is tested and validated, and then if accepted, it is immediately put into production. What is the term for this?

A. Continuous integration

B. Continuous delivery

C. A security nightmare

D. Agile development

6. B. Although this example includes continuous integration, the key thing to notice is that the code is then deployed into production. This means that Susan is operating in a continuous deployment environment, where code is both continually integrated and deployed. Agile is a development methodology and often uses CI/CD, but w cannot determine if Susan is using Agile.

7- Tim is working on a change to a web application used by his organization to fix a known bug. What environment should he be working in?

A. Test

B. Development

C. Staging

D. Production

7. B. Developers working on active changes to code should always work in the development environment. The test environment is where the software or systems can be tested without impacting the production environment. The staging environment is a transition environment for code that has successfully cleared testing and is waiting to be deployed into production. The production environment is the live system. Software, patches, and other changes that have been tested and approved move to production.

8- Which one of the following software development models focuses on the early and continuous delivery of software?

A. Waterfall

B. Agile

C. Spiral

D. Butterfly

8. B. One of the core principles of the Agile approach to software development is to ensure customer satisfaction via early and continuous delivery of software.

9- Kevin would like to ensure that his software runs on a platform that is able to expand and contract as needs change. Which one of the following terms best describes his goal?

A. Scalability

B. Elasticity

C. Cost effectiveness

D. Agility

9. B. The situation described in the scenario, expanding capacity when demand spikes and then reducing that capacity when demand falls again, is the definition of elasticity.

10- Which one of the following is not an advantage of database normalization?

A. Preventing data inconsistencies

B. Preventing injection attacks

C. Reducing the need for database restructuring

D. Making the database schema more informative

10. B. Database normalization has four main benefits. Normalized designs prevent data inconsistencies, prevent update anomalies, reduce the need for restructuring existing databases, and make the database schema more informative. They do not prevent web application attacks, such as SQL injection.

11- What data minimization technique replaces personal identifiers with unique identifiers that may be cross-referenced with a lookup table?
A. Tokenization

B. Hashing

C. Salting

D. Masking

11. A. Tokenization replaces personal identifiers that might directly reveal an individual's identity with a unique identifier using a lookup table. Hashing uses a cryptographic hash function to replace sensitive identifiers with an irreversible alternative identifier. Salting these values with a random number prior to hashing them makes these hashed values resistant to a type of attack known as a rainbow table attack.

12- Frank is investigating a security incident where the attacker entered a very long string into an input field, which was followed by a system command. What type of attack likely took place?

A. Cross-site request forgery

B. Server-side request forgery

C. Command injection

D. Buffer overflow

12. D. Buffer overflow attacks occur when an attacker manipulates a program into placing more data into an area of memory than isallocated for that program's use. The goal is to overwrite other information in memory with instructions that may be executed by a different process running on the system.

13- What type of attack places an attacker in the position to eavesdrop on communications between a user and a web server?

A. Man-in-the-middle

B. Session hijacking

C. Buffer overflow

D. Meet-in-the-middle

13. A. In a man-in-the-middle attack, the attacker fools the user into thinking that the attacker is actually the target website and presenting a fake authentication form. They may then authenticate to the website on the user's behalf and obtain the cookie. This is slightly different from a session hijacking attack, where the attacker steals the cookie associated with an active session.

14- Tom is a software developer who creates code for sale to the public. He would like to assure his users that the code they receive actually came from him. What technique can he use to best provide this assurance?

A. Code signing

B. Code endorsement

C. Code encryption

D. Code obfuscation

14. A. Code signing provides developers with a way to confirm the authenticity of their code to end users. Developers use a cryptographic function to digitally sign their code with their own private key, and then browsers can use the developer's public key to verify that signature and ensure that the code is legitimate and was not modified by unauthorized individuals.

15- What type of cross-site scripting attack would not be visible to a security professional inspecting the HTML source code in a browser?

A. Reflected XSSB. Stored XSS

C. Persistent XSS

D. DOM-based XSS

15. D. DOM-based XSS attacks hide the attack code within the Document Object Model. This code would not be visible to someone viewing the HTML source of the page. Other XSS attacks would leave visible traces in the browser.

16- Joe checks his web server logs and sees that someone sent the following query string to an application running on the server: http://www mycompany.com/servicestatus.php?serviceID=892&serviceID=892' ; DROP TABLE Services;-- What type of attack was most likely attempted?

A. Cross-site scripting

B. Session hijacking

C. Parameter pollution

D. Man-in-the-middle

16. C. This query string is indicative of a parameter pollution attack. In this case, it appears that the attacker was waging a SQL injection attack and tried to use parameter pollution to slip the attack past content filtering technology. The two instances of the serviceID parameter in the query string indicate a parameter pollution attempt.

17- Upon further inspection, Joe finds a series of thousands of requests to the same URL coming from a single IP address. Here
are a few examples:

http://www.mycompany.com/servicestatus.php?serviceID=1
http://www.mycompany.com/servicestatus.php?serviceID=2
http://www.mycompany.com/servicestatus.php?serviceID=3
http://www.mycompany.com/servicestatus.php?serviceID=4
http://www.mycompany.com/servicestatus.php?serviceID=5
http://www.mycompany.com/servicestatus.php?serviceID=6

What type of vulnerability was the attacker likely trying to exploit?

A. Insecure direct object reference

B. File upload

C. Unvalidated redirect

D. Session hijacking

17. A. The series of thousands of requests incrementing a variable indicate that the attacker was most likely attempting to exploit an insecure direct object reference vulnerability.

18- Joe’s adventures in web server log analysis are not yet complete. As he continues to review the logs, he finds the request http://www mycompany.com/../../../etc/passwdWhat type of attack was most likely attempted?

A. SQL injection

B. Session hijacking

C. Directory traversal

D. File upload

18. C. In this case, the .. operators are the tell-tale giveaway that the attacker was attempting to conduct a directory traversal attack. This particular attack sought to break out of the web server's root directory and access the /etc/passwd file on the server.

19- Wendy is a penetration tester who wishes to engage in a session hijacking attack. What information is crucial for Wendy to obtain if her attack will be successful?

A. Session ticket

B. Session cookie

C. Username

D. User password

19. B. Websites use HTTP cookies to maintain sessions over time. If Wendy is able to obtain a copy of the user's session cookie, she can use that cookie to impersonate the user's browser and hijack the authenticated session.

20- Joe is examining the logs for his web server and discovers that auser sent input to a web application that contained the string
WAITFOR . What type of attack was the user likely attempting 

A. Timing-based SQL injection

B. HTML injection

C. Cross-site scripting

D. Content-based SQL injection

20. A. The use of the SQL WAITFOR command is a signature characteristic of a timing-based SQL injection attack.
