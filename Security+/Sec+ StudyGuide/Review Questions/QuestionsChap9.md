Chapter 9 Resilience and Physical Security Review Questions

1- Naomi wants to deploy a tool that can allow her to scale horizontally while also allowing her to patch systems withoutinterfering with traffic to her web servers. What type of technology should she deploy?

A. A load balancer

B. NIC teaming

C. Geographic diversity

D. A multipath network

1. A. A load balancer will fit Naomi's needs perfectly. Load balancers can spread traffic across multiple systems while allowing specific systems to be added or removed from the service pools in use. NIC teaming is used to increase bandwidth or to provide multiple network connections to a system, geographic diversity helps ensure that a single disaster impacting an organization cannot take the organization offline, and a multipath network prevents the disruption of a single network path from causing an outage.

2- Rick performs a backup that captures the changes since the last full backup. What type of backup has he performed?

A. A new full backup

B. A snapshot

C. An incremental backup

D. A differential backup

2. D. Differential backups back up the changes since the last full backup. Incremental backups back up changes since the last backup, and snapshots are a live copy of a system. This is not a full backup, because it is capturing changes since a full backup.

3- What type of recovery site has some or most systems in place but does not have the data needed to take over operations?

A. A hot site

B. A warm site

C. A cloud site

D. A cold site

3. B. Warm sites have systems, connectivity, and power but do not have the live or current data to immediately take over operations. A hot site can immediately take over operations, whereas a cold site has space and power, and likely connectivity, but will require that systems and data be put in place to be used. Cloud sites are not one of the three common types of recovery sites.

4- Ben wants to implement a RAID array that combines both read and write performance while retaining data integrity if a drive fails. Cost is not a concern compared to speed and resilience. What RAID type should he use?

A. RAID 1

B. RAID 5

C. RAID 6

D. RAID 10

4. D. RAID 10 (1+0) combines the benefits and downfalls of both RAID 0, striping, and RAID 1 mirroring. In Ben's use case, where speed and resilience are important and cost is not, striped drives with full copies maintained via the mirror is his best option. RAID 5 and RAID 6 have slower performance but can survive a loss of a drive. RAID 1, mirroring, provides redundancy and read speeds but does not improve write speeds.

5- Cynthia wants to clone a virtual machine. What should she do to capture a live machine, including the machine state?

A. A full backup

B. A snapshot

C. A differential backup

D. A LiveCD

5. B. Virtual machine snapshots capture the machine state at a point in time and will allow Cynthia to clone the system. A full backup and a differential backup can be used to capture the disk for the machine but typically will not capture the memory state and other details of the system state. A LiveCD allows you to boot and run a nonpersistent system from trusted media.
   
6- Sally is working to restore her organization's operations after a disaster took her datacenter offline. What critical document should she refer to as she restarts systems? 

A. The restoration order documentation

B. The TOTP documentation

C. The HOTP documentation

D. The last-known good configuration documentation

6. A. A documented restoration order helps ensure that systems and services that have dependencies start in the right order and that high-priority or mission-critical services are restored first. TOTP and HOTP are types of one-time password technology, and last-known good configurations are often preserved with a snapshot or other technology that can allow a system to return to a known good status after an issue such as a bad patch or configuration change.

7- Mike wants to stop vehicles from traveling toward the entrance of his building. What physical security control should he implement?

A. An air gap

B. A hot aisle

C. A robotic sentry

D. A bollard

7. D. Bollards are physical security controls that prevent vehicles from accessing or ramming doors or other areas. They may look like pillars, planters, or other innocuous objects. An air gap is a physical separation of technology environments; a hot aisle is the aisle where systems in a datacenter exhaust warm air; and unlike in movies, robotic sentries are not commonly deployed and aren't ready to stop vehicles in most current circumstances.

8- Amanda wants to securely destroy data held on DVDs. Which of the following options is not a suitable solution for this?

A. Degaussing

B. Burning

C. Pulverizing

D. Shredding

8. A. Degaussing only works on magnetic media, and DVDs are optical media. Amanda could burn, pulverize, or even shred the DVDs to ensure that data is properly destroyed.

9- Why are Faraday cages deployed?

A. To prevent tailgating

B. To assist with fire suppression

C. To prevent EMI

D. To prevent degaussing

9. C. Faraday cages prevent electromagnetic emissions and are used to stop wireless signals and other unwanted EMI. Mantraps are used to prevent tailgating; Faraday cages are not used for fire suppression; and though a Faraday cage would likely stop a degausser, it isn't typically used for that purpose.

10- Which of the following controls helps prevent insider threats?

A. Two-person control

B. Visitor logs

C. Air gaps

D. Reception desks and staff

10. A. Two-person control is specifically intended to prevent insider threats by requiring two individuals to take a given action. Visitor logs help determine who may have been admitted to a facility but would not stop an insider threat. Air gaps protect from network-based attacks, but an insider can bypass the air gap intentionally. Reception staff allow insiders into a facility if they are permitted to enter, which will not stop an insider threat either.

11- Madhuri wants to implement a camera system but is concerned about the amount of storage space that the video recordings will require. What technology can help with this?

A. Infrared cameras

B. Facial recognition

C. Motion detection

D. PTZ

11. C. Motion-detecting cameras can be used to help conserve storage space for video by recording only when motion is detected. In low-usage spaces like datacenters, this means recording will occur only occasionally. In more heavily used areas, the impact on total space used will be smaller but can still be meaningful, particularly after business hours. Infraredcameras, facial recognition, and the ability to pan, tilt, and zoom (PTZ) a camera are important features, but they do not help conserve storage space.

12- What factor is a major reason organizations do not use security guards?

A. Reliability

B. Training

C. Cost

D. Social engineering

12. C. Security guards can be one of the most costly physical security controls over time, making the cost of guards one of the most important deciding factors guiding when and where they will be employed. Reliability, training, and the potential for social engineering are all possible issues with security guards, but none of these is the major driver in the decision process.

13- Michelle wants to ensure that attackers who breach her network security perimeter cannot gain control of the systems that run the industrial processes her organization uses as part of their business. What type of solution is best suited to this?

A. An air gap

B. A Faraday cage

C. A cold aisle

D. A screened subnet

13. A. An air gap is a physical separation of devices. By implementing an air gap, Michelle can ensure that devices cannot be accessed via the network, thus preventing intruders who have breached her network perimeter security from accessing the industrial control systems she is responsible for securing. A Faraday cage stops electromagnetic signals and emissions (EMI), a cold aisle is the air-conditioned aisle in a datacenter where cold air is pulled into systems, and a screened subnet is where systems that deal with untrusted traffic are placed.

14- Kathleen wants to discourage potential attackers from entering the facility she is responsible for. Which of the following is not a common control used for this type of preventive defense?

A. Fences

B. Lighting

C. Robotic sentries

D. Signs

14. C. Fences, lighting, and signs can all help discourage potential malicious actors from entering an area, although a determined adversary will ignore or bypass all three. Robotic sentries appear in the exam outline but are not a common solution for most organizations.  

15- How does technology diversity help ensure cybersecurity resilience?

A. It ensures that a vulnerability in a single company's product will not impact the entire infrastructure.

B. If a single vendor goes out of business, the company does not need to replace its entire infrastructure.

C. It means that a misconfiguration will not impact the company's entire infrastructure.

D. All of the above.

15. D. Technology diversity helps ensure that a single failure—due to a vendor, vulnerability, or misconfiguration—will not impact an entire organization. Technology diversity does have additional costs, including training, patch management, and configuration management.

16- Scott sends his backups to a company that keeps them in a secure vault. What type of backup solution has he implemented?

A. Nearline

B. Safe

C. Online

D. Offline

16. D. Scott has implemented an offline backup scheme. His backups will take longer to retrieve because they are at a remote facility and will have to be sent back to him, but they are likely to survive any disaster that occurs in his facility or datacenter. Online backups are kept immediately accessible, whereas nearline backups can be retrieved somewhat more slowly than online backups but faster than offline backups. Safe backups is not an industry term.

17- Gabby wants to implement a mirrored drive solution. What RAID level does this describe?

A. RAID 0

B. RAID 1

C. RAID 5

D. RAID 6

17. B. RAID 1 mirrors drives, providing higher read speeds and a redundant copy of the data while using twice the storage space. RAID 0 is striping; RAID 5 and 6 do striping with parity, using additional space to provide checksums for data.

18- Florian wants to ensure that systems on a protected network cannot be attacked via the organization's network. What design technique should he use to ensure this?

A. A hot aisle

B. An air gap

C. A cold aisle

D. Protected cable distribution

18. B. Florian can use an air gapped network. An air gapped network or system is one without a connection to other systems or networks, requiring data and files to be manually copied to it. Hot and cold aisles are used in datacenters as part of airflow and thermal regulation, and protected cable distribution is used to ensure that cables cannot be accessed or tapped without network administrators or security professionals being aware.

19- What type of physical security control is shown here?

A. A Faraday cage

B. An access control vestibule

C. A bollard

D. An air gap

19. B. A mantrap uses a pair of doors. When an individual enters, the first door must be closed and secured before the second door can be opened. This helps prevent tailgating, since the person entering will notice anybody following them through the secured area. A Faraday cage is used to stop EMI, a bollard prevents vehicular traffic, and an air gap is a physical separation of networks or devices.

20- Gurvinder identifies a third-party datacenter provider over 90 miles away to run his redundant datacenter operations. Why has he placed the datacenter that far away?

A. Because it is required by law

B. Network traffic latency concerns

C. Geographic dispersal

D. Geographic tax reasons

20. C. Geographic dispersal helps ensure that a single natural or man-made disaster does not disable multiple facilities. This distance is not required by law; latency increases with distance; and though there may be tax reasons in some cases, this is not a typical concern for a security professional.