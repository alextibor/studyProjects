Chapter 3: Malicious Code Review Questions

1- Gurvinder has been asked to assist a company that recently fired one of their developers. After the developer was terminated, the critical application that they had written for the organization stopped working and now displays a message reading “You shouldn't have fired me!” If the developer's access was terminated and the organization does not believe that they would have had access to any systems or code after they left the organization, what type of malware should Gurvinder look for?

A. A RAT

B. A PUP

C. A logic bomb

D. A keylogger

1. C. A logic bomb is a type of malware that activates after specific conditions are met. Here, the developer no longer showing up in payroll, not entering a specific input, or another activation scheme could have been used. A RAT is a remote access Trojan, a PUP is a potentially unwanted program, and a keylogger steals user input.

2- Naomi believes that an attacker has compromised a Windows workstation using a fileless malware package. What Windows scripting tool was most likely used to download and execute the malware?

A. VBScript

B. Python

C. Bash

D. PowerShell

2. D. PowerShell is the most likely tool for this type of exploit. VBScript would be used inside an application, and both Bash and Python are more likely to exist on a Linux system.

3- Scott notices that one of the systems on his network contacted a number of systems via encrypted web traffic, downloaded a handful of files, and then uploaded a large amount of data to a remote system. What type of infection should he look for?

A. A keylogger

B. A backdoor

C. A bot

D. A logic bomb

3. C. The behaviors that Scott is seeing are characteristic of a bot infection. The bot was likely contacting command-and-control hosts, then downloading updates and/or additional packages, then uploading data from his organization. He will need to determine if sensitive or important business information was present on the system or accessible from it. Keyloggers will capture keystrokes and user input but would typically require additional malware packages to display this behavior. A logic bomb might activate after an event, but no event is described, and a backdoor is used for remote access.

4- Amanda notices traffic between her systems and a known malicious host on TCP port 6667. What type of traffic is she most likely detecting?

A. Command and control

B. A hijacked web browser

C. A RAT

D. A worm

4. A. Amanda has most likely discovered a botnet's command-and- control (C&C) channel, and the system or systems she is monitoring are probably using IRC as the C&C channel. A RAT is more likely to use a different control channel, worms spread by attacking vulnerable services, and a hijacked web browser would probably operate on common HTTP or HTTPS ports (80/443).

5- Mike discovers that attackers have left software that allows them to have remote access to systems on a computer in his company's network. How should he describe or classify this malware?

A. A worm

B. Crypto malware

C. A Trojan

D. A backdoor

5. D. Remote access to a system is typically provided by a backdoor. Backdoors may also appear in firmware or even in hardware. None of the other items listed provide remote access by default, although they may have a backdoor as part of a more capable malware package.

6- Naomi wants to provide guidance on how to keep her organization's new machine learning tools secure. Which of the following is not a common means of securing machine learning algorithms?

A. Understand the quality of the source data

B. Build a secure working environment for ML developers

C. Require third-party review for bias in ML algorithms

D. Ensure changes to ML algorithms are reviewed and tested

6. C. Requiring third-party review of ML algorithms is not a common requirement, but ensuring that you use high-quality source data, that the working environment remains secure, and that changes are reviewed and tested are all common best practices for ML algorithm security.

7- What type of malware is adware typically classified as?

A. A DOG

B. A backdoor

C. A PUP

D. A rootkit

7. C. Adware is typically classified as a type of potentially unwanted program, or PUP. Backdoors and rootkits are definitely malicious, whereas adware may simply be unwanted and annoying. A DOG is not a term commonly used to describe malware.

8- Matt uploads a malware sample to a third-party malware scanning site that uses multiple antimalware and antivirus engines to scan the sample. He receives several different answers for what the malware package is. What has occurred?

A. The package contains more than one piece of malware.

B. The service is misconfigured.

C. The malware is polymorphic and changed while being tested.

D. Different vendors use different names for malware packages.

8. D. One of the challenges security practitioners can face when attempting to identify malware is that different antivirus and antimalware vendors will name malware packages and families differently. This means that Matt may need to look at different names to figure out what he is dealing with.

9- Nancy is concerned that there is a software keylogger on the system she is investigating. What data may have been stolen?

A. All files on the system

B. All keyboard input

C. All files the user accessed while the keylogger was active

D. Keyboard and other input from the user

9. D. Though keyloggers often focus on keyboard input, other types of input may also be captured, meaning Nancy should worry about any user input that occurred while the keylogger was installed. Keyloggers typically do not target files on systems, although if Nancy finds a keylogger she may want to check for other malware packages with additional capabilities.

10- Crypto malware is a type of what sort of malware?

A. Worms

B. PUP

C. Ransomware

D. Rootkit

10. C. Crypto malware, a type of ransomware, typically demands payment to decrypt critical files or entire drives. PUPs are potentially unwanted programs like spyware and adware, whereas rootkits are used to gain control of systems without being detected and worms self-spread by exploiting vulnerabilities.

11- Rick believes that a system he is responsible for has been compromised with malware that uses a rootkit to obtain and retain access to the system. When he runs a virus scan, the system doesn't show any malware. If he has other data that indicates the system is infected, what should his next step be if he wants to determine what malware may be on the system?

A. Rerun the antimalware scan.

B. Mount the drive on another system and scan it that way.

C. Disable the systems antivirus because it may be causing a false negative.

D. The system is not infected and he should move on.

11. B. Rootkits are designed to hide from antimalware scanners and can often defeat locally run scans. Mounting the drive in another system in read-only mode, or booting from a USB drive and scanning using a trusted, known good operating system, can be an effective way to determine what malware is on a potentially infected system.

12- Tracy is concerned about attacks against the machine learning algorithm that her organization is using to assess their network. What step should she take to ensure that her baseline data is not tainted?

A. She should scan all systems on the network for vulnerabilities and remediate them before using the algorithm.

B. She should run the ML algorithm on the network only if she believes it is secure.

C. She should disable outbound and inbound network access so that only normal internal traffic is validated.

D. She should disable all firewall rules so that all potential traffic can be validated.

12. B. If Tracy is worried about baselining her network and having tainted data, she needs to ensure that no malicious activity is occurring when she runs the baseline data capture. That way, the machine learning algorithm will only be working with normal traffic patterns and behaviors and can then detect and alert on things that are abnormal.

13- Selah wants to ensure that malware is completely removed from a system. What should she do to ensure this?

A. Run multiple antimalware tools and use them to remove all detections.

B. Wipe the drive and reinstall from known good media.

C. Use the delete setting in her antimalware software rather than the quarantine setting.

D. There is no way to ensure the system is safe and it should be destroyed.

13. B. In most malware infection scenarios, wiping the drive and reinstalling from known good media is the best option available. If the malware has tools that can infect the system BIOS, even this may not be sufficient, but BIOS-resident malware is relatively uncommon. Multiple antivirus and antimalware tools, even if they are set to delete malware, may still fail against unknown or advanced malware packages. Destroying systems is uncommon and expensive and is unlikely to be acceptable to most organizations as a means of dealing with a malware infection.

14- What type of malware is frequently called stalkerware because of its use by those in intimate relationships to spy on their partners?

A. Worms

B. RATs

C. Crypto malware

D. PUPs

14. B. RATs, or remote access Trojans, are sometimes called stalkerware because they are often utilized by those in intimate relationships to spy on their partners. They provide remote access and other capabilities to computers and mobile devices.

15- Ben wants to analyze Python code that he believes may be malicious code written by an employee of his organization. What can he do to determine if the code is malicious?

A. Run a decompiler against it to allow him to read the code.

B. Open the file using a text editor to review the code.

C. Test the code using an antivirus tool.

D. Submit the Python code to a malware testing website.

15. B. Python is an interpreted rather than a compiled language, so Ben doesn't need to use a decompiler. Instead, his best bet is to open the file and review the code to see what it does. Since it was written by an employee, it is unlikely that it will match an existing known malicious package, which means antivirus and antimalware tools and sites will be useless.

16- What type of malware is VBA code most likely to show up in?

A. Macro viruses

B. RATs

C. Worms

D. Logic bombs

16. A. Visual Basic for Applications (VBA) code is most likely to show up in macro viruses. VBA is used inside Microsoft Office as a scripting language.

17- Angela wants to limit the potential impact of malicious Bash scripts. Which of the following is the most effective technique she can use to do so without a significant usability impact for most users?

A. Disable Bash.

B. Switch to another shell.

C. Use Bash's restricted mode.

D. Prevent execution of Bash scripts.

17. C. Bash's restricted shell mode removes many of the features that can make Bash useful for malicious actors. You can read more about Bash in restricted shell mode at www.gnu.org/software/bash/manual/html_node The-Restricted-Shell.html.

18- Fred receives a call to respond to a malware-infected system. When he arrives, he discovers a message on the screen that reads “Send .5 Bitcoin to the following address to recover your files.” What is the most effective way for Fred to return the system to normal operation?

A. Pay the Bitcoin ransom.

B. Wipe the system and reinstall.

C. Restore from a backup if available.

D. Run antimalware software to remove malware.

18. C. In most cases, if a backup exists it is the most effective way to return to normal operation. If no backup exists, Fred may be faced with a difficult choice. Paying a ransom is prohibited by policy in many organizations and does not guarantee that the files will be unlocked. Wiping and reinstalling may result in the loss of data, much like not paying the ransom. Antimalware software may work, but if it did not detect the malware in thefirst place, it may not work, or it may not decrypt the files encrypted by the malware.

19- What type of malware connects to a command-and-control system, allowing attackers to manage, control, and update it remotely?

A. A bot

B. A drone

C. A vampire

D. A worm

19. A. Bots connect to command-and-control systems, allowing them to be updated, controlled, and managed remotely. Worms spread via vulnerabilities, and drones and vampires aren't common terms for malware.

20- James notices that a macro virus has been detected on a workstation in his organization. What was the most likely path for 
the infection?

A. A drive-by download via a web browser

B. A worm spread the macro virus

C. A user intentionally enabled macros for an infected file

D. A remote access Trojan was used to install the macro virus

20. C. Modern versions of Microsoft Office disable macros by default. For most macro viruses to successfully attack systems, users must enable macros. Social engineering and other techniques are used to persuade users that they want or need to enable macros in infected files, allowing the malicious scripts to run.