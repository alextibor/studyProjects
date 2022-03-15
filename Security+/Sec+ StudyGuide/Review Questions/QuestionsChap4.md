Chapter 4: Social Engineering, Physical, and Password Attacks Review Questions

1- Which of the following is the best description of tailgating?
 
A. Following someone through a door they just unlocked

B. Figuring out how to unlock a secured area

C. Sitting close to someone in a meeting

D. Stealing information from someone's desk

1. A. Tailgating is best defined as following someone through a door they just unlocked, thus gaining access to a secured area without presenting credentials or having the key or other access required to open the door.

2- When you combine phishing with Voice over IP, it is known as:
   
A. Spoofing

B. Spooning

C. Whaling

D. Vishing

2. D. Vishing involves combining phishing with Voice over IP. Whaling focuses on targeting important targets for phishing attacks, spoofing is a general term that means faking things, and spooning is not a technical term used for security practices.

3- Alan reads Susan's password from across the room as she logs in. What type of technique has he used?
 
A. A man-in-the-room attack

B. Shoulder surfing

C. A man-in-the-middle attackD. Pretexting

3. B. Shoulder surfing is the process of watching what someone is doing to acquire passwords or other information. A man-in-the- middle attack is a technical attack that inserts an attacker between a victim and a legitimate server or other destination to capture traffic. Pretexting is a social engineering technique that presents a reason or excuse why something is needed or done. A man-in-the-room attack was made up for this question.

4- Joanna recovers a password file with passwords stored as MD5 hashes. What tool can she use to crack the passwords?
   
A. MD5sum

B. John the Ripper

C. GPG

D. Netcat

4. B. Joanna needs to use a password cracking tool. Although John the Ripper is a useful password cracking tool, an even faster technique for most passwords with a known hashing scheme would be to use a rainbow table–based password cracker like OphCrack to look up the hashes using a precomputed database of likely passwords. MD5sum is a tool for creating MD5 hashes, not for cracking passwords, GPG is an encryption tool, and netcat is a great network tool with many uses, but password cracking is not one of them!

5- What technique is most commonly associated with the use of malicious flash drives by penetration testers?

A. Mailing them to targets

B. Sneaking them into offices and leaving them in desk drawers

C. Distributing them in parking lots as though they were dropped

D. Packing them to look like a delivery and dropping them off with a target's name on the package

5. C. Distributing malicious flash drives in a parking lot or other high-traffic area, often with a label that will tempt the person who finds it into plugging it in, is a technique used by penetration testers.

6- Selah infects the ads on a website that users from her target company frequently visit with malware as part of her penetration test. What technique has she used?

A. A watering hole attack

B. Vishing

C. Whaling

D. Typosquatting

6. A. Watering hole attacks rely on compromising or infecting a website that targeted users frequently visit, much like animals will visit a common watering hole. Vishing is phishing via voice, whaling is a targeted phishing attack against senior or important staff, and typo squatting registers similar URLs that are likely to be inadvertently entered in order to harvest clicks or conduct malicious activity.

7- Ben searches through an organization's trash looking for sensitive documents, internal notes, and other useful information. What term describes this type of activity?

A. Waste engineering

B. Dumpster diving

C. Trash pharming

D. Dumpster harvesting

7. B. Dumpster diving is a broad term used to describe going through trash to find useful information, often as part of a penetration test or by attackers looking for information about an organization. As you may have guessed, the other answers were made up.

8- Skimming attacks are often associated with what next step by attackers?

A. Phishing

B. Dumpster diving

C. Vishing

D. Cloning

8. D. Cloning attacks often occur after a skimmer is used to capture card information. Skimming devices may include magnetic stripe readers, cameras, and other technology to allow attackers to make a complete copy of a captured card. Phishing focuses on acquiring credentials or other information but isn't a typical follow-up to a skimming attack. Dumpster diving and vishing are both unrelated techniques as well.

9- Alaina suspects that her organization may be targeted by a SPIM attack. What technology is she concerned about?

A. Spam over Instant Messaging

B. Social Persuasion and Intimidation by Managers

C. Social Persuasion by Internet Media

D. Spam over Internal Media

9. A. SPIM is Spam over Internet Messaging (originally “Instant Messenger,” but this acronym was updated after IM tools became less common). Alaina will need to consider a variety of messaging tools where external and internal communications could also include spam. The other answers were made up.

10-  Alex discovers that the network routers that his organization has recently ordered are running a modified firmware version that does not match the hash provided by the manufacturer when he compares them. What type of attack should Alex categorize this attack as?
   
A. An influence campaign

B. A hoax

C. A supply chain attack

D. A pharming attack

10. C. Supply chain attacks occur before software or hardware is delivered to an organization. Influence campaigns seek to change or establish opinions and attitudes. Pharming attacks redirect legitimate traffic to fake sites, and hoaxes are intentional deceptions.

11-  Nicole accidentally types www.smazon.com into her browser and discovers that she is directed to a different site loaded with ads and pop-ups. Which of the following is the most accurate description of the attack she has experienced?
   
A. DNS hijacking

B. Pharming

C. Typosquatting

D. Hosts file compromise12. Lucca's organization runs a hybrid datacenter with systems in

11. C. Typo squatting uses misspellings and common typos of websites to redirect traffic for profit or malicious reasons. Fortunately, if you visit smazon.com , you'll be redirected to the actual amazon.com website, because Amazon knows about and works to prevent this type of issue. DNS hijacking and hosts file modifications both attempt to redirect traffic to actual URLs or hostnames to different destinations, and pharming does redirect legitimate traffic to fake sites, but typo squatting is the more specific answer.

12- Microsoft's Azure cloud and in a local facility. Which of the following attacks is one that he can establish controls for in both locations?

A. Shoulder surfing

B. Tailgating

C. Dumpster diving

D. Phishing

12. D. Shoulder surfing, tailgating, and dumpster diving are all in- person physical attacks and are not something that will be in Lucca's control with a major cloud vendor. Anti-phishing techniques can be used regardless of where servers and services are located.

13-  Alaina discovers that someone has set up a website that looks exactly like her organization's banking website. Which of the following terms best describes this sort of attack?

A. Phishing

B. Pharming

C. Typosquatting

D. Tailgating

13. B. Pharming best fits this description. Pharming attacks use web pages that are designed to look like a legitimate site but that attempt to capture information like credentials. Typo squatting relies on slightly incorrect hostnames or URLs, and nothing like that is mentioned in the question. Tailgating is an in-person attack, and phishing is typically done via email or other means to request information, not by setting up a site like this, although some phishing attacks may direct to a pharming website!

14-  When a caller was recently directed to Amanda, who is a junior IT employee at her company, the caller informed her that they were the head of IT for her organization and that she needed to immediately disable the organization's firewall due to an ongoing issue with their e-commerce website. After Amanda made the change, she discovered that the caller was not the head of IT, and that it was actually a penetration tester hired by her company. Which social engineering principle best matches this type of attack?

A. Authority

B. Consensus

C. Scarcity

D. Trust

14. A. The caller relied on their perceived authority to require Amanda to make the change. They likely also used urgency, which isn't mentioned here, but that would cause Amanda to potentially skip the validation or verification processes she would have normally used in a scenario like this. There is no effort to build consensus or establish trust, nor is there a sense of scarcity as described in the scenario.

15-  What type of malicious actor is most likely to use hybrid warfare?

A. A script kiddie

B. A hacktivist

C. An internal threat

D. A nation-state

15. D. Hybrid warfare combines active cyberwarfare, influence campaigns, and real-world direct action. This makes hybrid warfare almost exclusively the domain of nation-state actors.

16- Sharif receives a bill for services that he does not believe his company requested or had performed. What type of social engineering technique is this?

A. Credential harvesting

B. A hoax

C. Reconnaissance

D. An invoice scam

16. D. This is an example of an invoice scam. Most invoice scams involve sending fake invoices hoping to be paid. No information is being gathered, so this isn't reconnaissance or credential harvesting. This could be a hoax, but the more accurate answer is an invoice scam. Note that some social engineering uses false invoices to deploy malware by including it as an attachment or by using an attachment with malicious scripts built into a Microsoft Office file.

17-  Naomi receives a report of smishing. What type of attack should she be looking for?

A. Compressed files in phishing

B. Text message–based phishing

C. Voicemail-based phishing

D. Server-based phishing

17. B. Smishing is a type of phishing that occurs via text (SMS) message.

18-  Charles wants to find out about security procedures inside his target company, but he doesn't want the people he is talking to realize that he is gathering information about the organization. He engages staff members in casual conversation to get them to talk about the security procedures without noticing that they have done so. What term describes this process in social engineering efforts?

A. Elicitation

B. Suggestion

C. Pharming

D. Prepending

18. A. Elicitation is the process of using casual conversation and subtle direction to gather information without the targets realizing they have disclosed details to that social engineer. Suggestion is not one of the terms used in the Security+ exam outline, pharming redirects traffic to malicious sites, andprepending can include a variety of techniques that add data or terms.

19- A caller reached a member of the IT support person at Carlos's company and told them that the chairman of the company's board was traveling and needed immediate access to his account but had been somehow locked out. They told the IT support person that if the board member did not have their password reset, the company could lose a major deal. If Carlos receives a report about this, which of the principles of social engineering should he categorize the attacker's efforts under?

A. Scarcity

B. Familiarity

C. Consensus

D. Urgency

19. D. The caller was attempting to create a sense of urgency that would cause the help desk staff member to bypass normal procedures and let them set the board member's password to something that the social engineer would know. There is no implication of something scarce or that the caller is trying to get the help desk member to feel like others agree about the topic, thus using consensus. Familiarity takes more than using a board member's name or details about the company.

20- What type of phishing targets specific groups of employees, such as all managers in the financial department of a company?

A. Smishing

B. Spear phishing

C. Whaling

D. Vishing

20. B. Spear phishing is aimed at specific groups. Whaling would target VIPs and executives, smishing uses SMS (text) messages, and vishing is done via voice or voicemail.