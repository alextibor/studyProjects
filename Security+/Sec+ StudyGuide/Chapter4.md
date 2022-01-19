# Chapter 4 - Social Engineering, Physical, and Password Attacks

Social engineering techniques focus on the human side of information security. Using social engineering techniques, security professionals and attackers can accomplish a variety of tasks ranging from acquiring information to gaining access to buildings, systems, and networks.

## Social Engineering

Social engineering is the practice of manipulating people through a variety of strategies to accomplish desired actions. Social engineers work to influence their targets to take actions that they might not otherwise have taken.

Seven key principles are leveraged to successfully social engineer an individualand though the list of principles and their names vary depending on the source you read, the Security+ exam focuses on:

**Authority**, which relies on the fact that most people will obey someone who appears to be in charge or knowledgeable, regardless of whether or not they actually are. A social engineer using the principle of authority may claim to be a manager, a government official, or some other person who would have authority in the situation they are operating in.

**Intimidation** relies on scaring or bullying an individual into taking a desired action. The individual who is targeted will feel threatened and respond by doing what the social engineer wants them to do.

**Consensus**-based social engineering uses the fact that people tend to want to do what others are doing to persuade them to take an action. A consensus-based social engineering attack might point out that everyone else in a department had already clicked on a link, or might provide fake testimonials about a product making it look safe. Consensus is called “social proof” in some categorization schemes.

**Scarcity** is used for social engineering in scenarios that make something look more desirable because it may be the last one available.

**Familiarity**-based attacks rely on you liking the individual or even the organization the individual is claiming to represent.

**Trust**, much like familiarity, relies on a connection with the individual they are targeting. Unlike with familiarity, which relies on targets thinking that something is normal and thus familiar, social engineers who use this technique work to build a connection with their targets so that they will take the actions that they want them to take.

**Urgency** relies on creating a feeling that the action must be taken quickly due to some reason or reasons.

Social engineering relies on human reactions, and we are most vulnerable when we are responding instead of thinking clearly.

## Social Engineering Techniques

There are both technical and nontechnical attacks that leverage those principles to get results that are desired by both attackers and penetration testers.

## Phishing

Phishing is a broad term used to describe the fraudulent acquisition of information, often focused on credentials like usernames and passwords, as well as sensitive personal information like credit card numbers and related data. Phishing is most often done via email, but a wide range of phishing techniques exist, including things like smishing, which is phishing via SMS (text) messages, and vishing, or phishing via telephone.

**Spear phishing** - targets specific individuals or groups in an organization in an attempt to gather desired information or access.

**Whaling** - much like spear phishing, targets specific people, but whaling is aimed at senior employees like CEOs and CFOs “big fish” in the company, thus the term whaling.

The most common defenses against phishing of all types is awareness. Technical means also exist, including filtering that helps prevent phishing using reputation tools, keyword and text pattern matching, and other technical methods of detecting likely phishing emails, calls, or texts.

## Credential Harvesting

Credential harvesting is the process of gathering credentials like usernames and passwords. redential harvesting is often performed via phishing attacks but may also be accomplished through system compromise. Although credential harvesting can be difficult to completely stop, multifactor authentication (MFA) remains a strong control that can help limit the impact of successful credential harvesting attacks. User awareness, technical tools that can stop harvesting attacks like phishing emails or related techniques, and strong monitoring and response processes can all help with credential harvesting and abuse of harvested credentials.

## Website Attacks

Attacks against websites are also used by social engineers, and **pharming** is one example. Pharming attacks redirect traffic away from legitimate websites to malicious versions. Pharming typically requires a successful technical attack that can change DNS entries on a local PC or on a trusted local DNS server, allowing the traffic to be redirected.

Typo squatters use misspelled and slightly off but similar to the legitimate site URLs to conduct typosquatting attacks. Typo squatters rely on the fact that people will mistype URLs and end up on their sites, thus driving ad traffic or even sometimes using the typo-based website to drive sales of similar but not legitimate products.

Unlike pharming, watering hole attacks don't redirect users; instead, they use websites that targets frequent to attack them. These frequently visited sites act like a watering hole for animals and allow the attackers to stage an attack, knowing that the victims will visit the site. Once they know what site their targets will use, attackers can focus on compromising it, either by targeting the site or deploying malware through other means such as an advertising network.

## Spam

Spam, sometimes called unsolicited or junk email, may not immediately seem like a social engineering technique, but spam often employs social engineering techniques to attempt to get recipients to open the message or to click on links inside of it. In fact, spam relies on one underlying truth that many social engineers will take advantage of: if you send enough tempting messages, you're likely to have someone fall for it!

**SPIM** (Spam over Instant Messaging) Another name for Spam in instant messaging.

## In-Person Techniques

in-person social engineering and penetration testing techniques are also important to know. The Security+ exam outline includes a number of in-person techniques such as dumpster diving, shoulder surfing, and tailgating.

Although it isn't really a social engineering technique, **dumpster diving** is a very effective information gathering technique. It is exactly what it sounds like: retrieving potentially sensitive information from a dumpster.

**Shoulder surfing** is the process of looking over a person's shoulder to capture information like passwords or other data. Preventing shoulder surfing requires awareness on the part of potential targets, although tools like polarized security lenses over mobile devices like laptops can help prevent shoulder surfing in public spaces.

**Tailgating** is a physical entry attack that requires simply following someone who has authorized access to an area so that as they open secured doors you can pass through as well. Tailgating is best prevented by individual awareness.

**Eliciting information** Eliciting information, often called elicitation, is a technique used to gather information without targets realizing they are providing it. Techniques like flattery, false ignorance, or even acting as a counselor or sounding board are all common elements of an elicitation effort. Talking a target through things, making incorrect statements so that they correct the person eliciting details with the information they need, and other techniques are all part of the elicitation process. Ideally, a social engineering target who has experienced an elicitation attack will never realize they have provided more information than they intended to, or will only realize it well after the fact.

**Prepending** can mean one of three things: 

    1. Adding an expression or phrase, such as adding “SAFE” to a set of email headers to attempt to fool a user into thinking it has passed an antispam tool
    2. Adding information as part of another attack to manipulate the outcome.
    3. Suggesting topics via a social engineering conversation to lead a target toward related information the social engineer is looking for.

## Identity Fraud and Impersonation

Pretending to be someone else is a key tool in a social engineer's toolkit, and like all of the other social engineering techniques we have discussed, it can be used for malicious purposes. Each of these techniques combines the willingness of the target or targets to believe the impersonator with the principles of social engineering to create a scenario where the social engineer will get the access, data, or other results they desire.

**Pretexting** is the process of using a made-up scenario to justify why you are approaching an individual. In many cases, simply making a verification call can defeat such attempts.

**Identity fraud** or identity theft, is the use of someone else's identity. Although identity fraud is typically used for financial gain by malicious actors, identity fraud may be used as part of penetration tests or other security efforts as well.

**Impersonation** where you act as if you are someone else, can be a limited form of identity fraud. In other cases, impersonation is less specific, and the social engineer or attacker who uses it may simply pretend to be a delivery driver or an employee of a service provider rather than claiming a specific identity.

**Hoaxes** Hoaxes, which are intentional falsehoods, comein a variety of forms ranging from virus hoaxes to fake news. Social media plays a large role in many modern hoaxes, and attackers and social engineers may leverage current hoaxes to assist in  their social engineering attempts.

**Invoice scams** which involve sending fake invoices to organizations in the hopes of receiving payment. Invoice scams can be either physical or electronic, and they rely on the recipient not checking to see if the invoice is legitimate.

## Reconnaissance and Impersonation

Social engineering is a great way to gather information and thus is often used as part of reconnaissance efforts. Social engineering can be used during phone calls, email, and other means of contact to elicit more information about a target than is publicly available. At the same time, on-site and in-person reconnaissance efforts use social engineering techniques to gain access, gather information, and bypass security systems and processes.

## Influence Campaigns

As cyberwarfare and traditional warfare have continued to cross over in deeper and more meaningful ways, online influence campaigns, which have traditionally focused on social media, email, and other online-centric mediums, have become part of what has come to be called hybrid warfare. Although the formal definition of hybridwarfare is evolving, it is generally accepted to include competition short of conflict, which may include active measures like cyberwarfare as well as propaganda and information warfare. Individuals and organizations conduct influence campaigns to turn public opinion in directions of their choosing. Even advertising campaigns can be considered a form of influence campaign, but in general, most influence campaigns are associated with disinformation campaigns.

## Password Attacks

Although social engineering is often used to acquire passwords or access, there are other ways to attack passwords as well. Everything from trying password after password in a brute-force attack to technical attacks that leverage precomputed password hashes in lookup systems to check acquired password hashes against a known database, can help attackers and penetration testers attack passwords.

**Brute-force** attacks which iterate through passwords until they find one that works. Actual brute-force methods can be more complex than just using a list of passwords and often involve word lists that use common passwords, words specifically picked as likely to be used by the target, and modification rules to help account for complexity rules. Regardless of how elegant or well thought out their input is, brute force in the end is simply a process that involves trying different variations until it succeeds.

**Password spraying** attacks are a form of brute-force attack that attempts to use a single password or small set of passwords against many accounts. This approach can be particularly effective if you know that a target uses a specific default password or a set of passwords. For example, if you were going to attack a sports team's fan website, common chants for the fans, names of well-known players, and other common terms related to the team might be good candidates for a password spraying attack.

**Dictionary attacks** are yet another form of brute-force attack that uses a list of words for their attempts. Commonly available brute-force dictionaries exist, and tools like John the Ripper, a popular open source password cracking tool, have word lists (dictionaries) built in. Many penetration testers build their own custom dictionaries as part of their intelligence gathering and reconnaissance processes.

Regardless of the password attack mechanism, an important differentiator between attack methods is whether they occur online, and thus against a live system that may have defenses in place, or if they are offline against a compromised or captured password store.

Rainbow tables are an easily searchable database of precomputed hashes using the same hashing methodology as the captured password file. Thus, if you captured a set of passwords that were hashed using MD5, you could compute or even purchase a full set of passwords for most reasonable password lengths, and then simply look up the hashes of those passwords in the table.

    If you're not familiar with the concept of hashing, now is a good time to review it. A hash is a one-way cryptographic function that takes an input and generates a unique and repeatable output from that input. No two inputs should ever generate the same hash, and a hash should not be reversible so that the original input can be derived from the hash. Rainbow tables don't allow you to break hashes, but they brute-force the solution by using computational power to create a database where hashes and the value that created them can be looked up. You still aren't reversing the hash, but you are able to figure out what plain text leads to that hash being created!

## Physical Attacks

Social engineering and on-site penetration testing often go hand in hand, and thus the physical side of social engineering has its own set of tools and techniques.

**Malicious flash drive** Penetration testers (and potentially attackers) may drop drives in locations where they are likely to be picked up and plugged in by unwitting victims at their target organization. An additional layer of social engineering is sometimes accomplished by labeling the drives with compelling text that will make them more likely to be plugged in: performance reviews, financial planning, or other key words that will tempt victims. 

Malicious flash drives and other devices are also sometimes effectively a Trojan, as when devices have shipped or been delivered with malware included either from the factory or through modifications made in the supply chain.

**Card cloning** attacks focus on capturing information from cards like RFID and magnetic stripe cards often used for entry access. Attackers may also conduct skimming attacks that use hidden or fake readers or social engineering and hand-held readers to capture (skim) cards, and then employ cloning tools to use credit cards and entry access cards for their own purposes.

**Supply chain attacks** attempt to compromise devices, systems, or software before it even reaches the organization.

## Summary

Social engineering techniques focus on human reactions and psychology to gather information and to perform attacks against individuals and organizations. The broad range of social engineering techniques rely on common principles that describe ways to influence people based on their reaction to pressures or stress.

Security professionals need to be aware of how social engineering is leveraged in attacks like phishing, impersonation, and reconnaissance efforts. Each technique has its own distinctive set of social engineering techniques and impacts that help make it unique.

Physical attacks against organizations also rely on social engineering concepts to help them succeed. Use of malicious USB devices like cables and flash drives take advantage of human behavior to lure users into plugging them in, and attacks against access cards may useskimmers or other techniques to allow cloning of the access cards used by an organization.

Password attacks focus on acquisition of passwords in an encrypted, hashed, or plain-text form, or on guessing passwords in order to gain access to systems or devices.

All of these attacks need to be assessed and considered in the operating environment of your organization. As organizations move from local physical infrastructure to cloud services, the threat and attack models that you must consider also need to change.

## Exam Essentials 

**There are seven key principles for social engineering.** The Security+ exam outline focuses on seven key social engineering principles. Authority relies on the victim believing that the person has a reason to be in charge or in a position of power. Intimidation relies on bullying or scaring the target into doing what is desired. Consensus builds on the trust that individuals have in others and what they think others are doing or believe. Scarcity leverages human reactions to limited supply. Familiarity uses what you expect and what you are used to against you. Trust is built and then used against the target. Urgency, the final item, makes what the social engineer expresses seem as if it is needed immediately.

**Many techniques are used for social engineering**. Many adversarial and security techniques rely on social engineering. Phishing and its related techniques of spear phishing, whaling, smishing, and vishing seek to gain personal information using social engineering techniques to drive responses. Techniques like tailgating and shoulder surfing are used in person to gain access to information. Eliciting information and impersonation can be used to acquire data or access. Across these and other techniques, a combination of technical, interpersonal, and physical techniques are used to accomplish the social engineer's goal.

**Passwords can be acquired and cracked in many ways.** Password attacks can be conducted both online against live systems and offline using captured password stores. Brute-force attacks like spraying and dictionary attacks as well as password cracking canrecover passwords in many circumstances. Unencrypted or plain-text passwords and improper storage methods make attacks even easier for attackers who can access them.

**Physical attacks rely on social engineering.** Social engineers use in-person, physical attacks to access organizations and networks. Malicious USB flash drives and cables, as well as card cloning and skimming attacks, are all part of a social engineer's toolkit. In addition, social engineers and other attackers may target the supply chain, which can be at risk for physical attacks through modifications of devices and software before they arrive at your organization. Social engineers who can access suppliers or the logistical chain that your organization relies on can compromise your security before you even take possession of your purchases.

