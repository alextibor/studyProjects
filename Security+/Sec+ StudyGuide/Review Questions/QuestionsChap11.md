Chapter 11 Endpoint Security Review Questions

1- Charles wants to monitor changes to a log file via a command line in real time. Which of the following command-line Linux tools will let him see the last lines of a log file as they change?

A. logger

B. tail

C. chmod

D. head

1. B. The Linux tail command with the -f flag will follow a file as it changes, showing the last 10 lines by default. Charles can use this to monitor a log file as it changes. logger adds text to the syslog file, chmod changes permissions, and head shows the first 10 lines of a file, which will typically be the oldest entries in a log file on a Linux system.

2- Naomi has discovered the following TCP ports open on a system she wants to harden. Which ports are used for unsecure services and thus should be disabled to allow their secure equivalents to continue to be used?
21  22  23  80  443

A. 21, 22, and 80

B. 21 and 80

C. 21, 23, and 80

D. 22 and 443

2. C. The services listed are:
21 – FTP
22 – SSH
23 – Telnet
80 – HTTP
443 – HTTPS
Of these services, SSH and HTTPS are secure options for remote shell access and HTTP. Although secure mode FTP (FTP/S) may run on TCP 21, there is not enough information to know for sure, and HTTPS can be used for secure file transfer if necessary. Thus, Naomi's best option is to disable all three likely unsecure protocols: FTP, Telnet, and HTTP.

3- Frank's organization is preparing to deploy a data loss prevention (DLP) system. What key process should they undertake before they deploy it?

A. Define data lifecycles for all nonsensitive data.

B. Encrypt all sensitive data.

C. Implement and use a data classification scheme.

D. Tag all data with the name of the creator or owner.

3. C. Protecting data using a DLP requires data classification so that the DLP knows which data should be protected and what policies to apply to it. Defining data lifecycles can help prevent data from being kept longer than it should be and improves data security by limiting the data that needs to be secured, but it isn't necessary as part of a DLP deployment. Encrypting all sensitive data may mean the DLP cannot recognize it and may not be appropriate for how it is used. Tagging all data with a creator or owner can be useful but is not required for a DLP rollout— instead, knowing the classification of the data is more important.

4- The company that Theresa works for has deployed IoT sensors that have built-in cellular modems for communication back to a central server. What issue may occur if the devices can be accessed by attackers? 

A. Attackers may change the baseband frequency used by the devices, causing them to fail. 

B. Attackers may switch the devices to a narrowband radio mode that limits the range of the cellular modems.

C. Attackers may steal the SIM cards from the devices and use them for their own purposes.

D. Attackers may clone the SIM cards from the devices to conduct attacks against one-time password systems.

4. C. Physical theft of SIM cards is a threat that cellular-connected devices may face. Using an integrated SIM rather than a removable SIM, or making the SIM difficult or impossible toaccess without significant effort, may help. Although cloning SIM cards to help defeat one-time password systems is an actual attack, IoT devices typically do not use a cellular connection to present a one-time password since no user are involved. Both the narrowband and baseband answers are not concerns in this scenario.

5- Which of the following is not a typical security concern with MFPs?

A. Exposure of sensitive data from copies and scans

B. Acting as a reflector for network attacks

C. Acting as an amplifier for network attacks

D. Use of weak encryption

5. D. MFPs, or multifunction printers, may contain sensitive data from copies or scans; some MFPs have built-in hard drives or other mass storage that can retain data for an extended period of time. They often have weak network security capabilities, making them useful as a reflector or amplifier in some network attacks. Fortunately, if a MFP supports protocols like TLS for web access, they support a reasonably secure implementation of the protocols needed to keep data transfers secure.

6- Michelle wants to prevent unauthorized applications from being installed on a system. What type of tool can she use to allow only permitted applications to be installed?

A. A hardening application

B. An allow list application

C. A deny list application

D. A HIPS

6. B. An allow list application will allow only specific permitted programs to be installed on a system. Deny list applications will prevent specified applications from being installed. Hardening applications are not a specific category of tool, although hardening scripts are in use, and a HIPS is a host intrusion prevention system.

7- What term is used to describe tools focused on detecting and responding to suspicious activities occurring on endpoints like desktops, laptops, and mobile devices?

A. EDR

B. IAM

C. FDE

D. ESC

7. A. Endpoint detection and response (EDR) systems provide monitoring, detection, and response capabilities for systems. EDR systems capture data from endpoints and send it to a central repository, where it can be analyzed for issues and indicators of compromise or used for incident response activities. IAM is identity and access management, FDE is full- disk encryption, and ESC is not a commonly used security acronym.

8- Which of the following is not typically part of a SoC?

A. A CPU

B. A display

C. Memory

D. I/O

8. C. A system on a chip (SoC) is a chip that has most of the functions of a complete computer built into it. In fact, most SoCs have a CPU, memory, input/output, and storage as part of the chip. Adding a display to the chip is unlikely, but adding a display that the SoC can access and display to is very common in things like smartphones, smart watches, and other devices.

9- What scripting environment is native to Windows systems?

A. Python

B. PowerShell

C. Bash

D. CMD

9. B. PowerShell is a native scripting environment for Windows systems. Although Python and Bash can be installed, they arenot automatically part of the operating system. CMD.exe will start the command prompt, but it is not a scripting environment.

10- Amanda is assessing a vehicle's internal network. What type of bus is she most likely to discover connecting its internal sensors and controllers?

A. Narrowband bus

B. A Zigbee bus

C. A CAN bus

D. An SoC bus

10. C. A controller area network (CAN) is a vehicle-specific standard designed to allow microcontrollers, sensors, and other components of the vehicle to communicate. Zigbee, a wireless protocol used for home automation and similar short-ranged purposes, would be poorly suited to use in vehicles. Narrowband describes a channel, not a bus type, and an SoC bus was made up for this question.  

11- The company that Hui works for has built a device based on an Arduino and wants to standardize its deployment across the entire organization. What type of device has Hui's organization deployed, and where should Hui place her focus on securing it? 

A. An FPGA, and on network security

B. A microcontroller, and on physical security

C. A GPU, and on network security

D. An ICS, and on physical security

11. B. Arduinos are a form of microcontroller, and since Arduinos in their default form do not have wired or wireless networking built in, Hui should focus on the physical security of the device.

12- Which of the following is not a typical reason to use an IP addressing schema in an enterprise?

A. Avoiding use of other organizations' IP addresses

B. Avoiding IP address exhaustion in a subnet

C. Asset and system inventory

D. Consistency of practice with gateway and other IP addresses

12. A. Organizations should use IP addresses that are specifically allocated to the organization or that are RFC 1918 addresses that are non-Internet routable. That means that an addressing scheme should not be necessary to avoid using another organization's IP addresses. IP address schemas are commonly used to avoid IP address exhaustion when working in a subnet. The same tracking means that they are helpful when conducting asset and system inventory, since they help match a device on the network to a known physical system. Finally, consistently using the same IP address for default gateways and other common network components means that support staff do not have to learn unique configurations in each location or network.

13- Brian has deployed a system that monitors sensors and uses that data to manage the power distribution for the power company that he works for. Which of the following terms is commonly used to describe this type of control and monitoring solution?

A. SCADA

B. AVAD

C. SIM

D. HVAC

13. A. SCADA (supervisory control and data acquisition) is a system architecture that combines data acquisition and control devices with communications methods and interfaces to oversee complex industrial and manufacturing processes, just like those used in utilities. A SIM (subscriber identity module) is the small card used to identify cell phones; HVAC stands for heating, ventilation, and air-conditioning; and AVAD was made up for this question.

14- The organization that Lynn works for wants to deploy an embedded system that needs to process data as it comes in to the device without processing delays or other interruptions. What type of solution does Lynn's company need to deploy?

A. An MFP

B. A HIPS

C. An SoC

D. An RTOS

14. D. A real-time operating system (RTOS) is an OS that is designed to handle data as it is fed to the operating system, rather than delaying handling it as other processes and programs are run. Real-time operating systems are used whenprocesses or procedures are sensitive to delays that might occur if responses do not happen immediately. An MFP is a multifunction printer, a HIPS is a host intrusion prevention system, and an SoC is a system on a chip—which is hardware, which might run an RTOS, but the answer does not mention what type of OS the SoC is running.

15- Which of the following is not a common constraint of an embedded system?

A. Compute

B. Form factor

C. Network

D. Authentication

15. B. Embedded systems are available in a broad range of physical form factors, allowing them to be placed in many different types of systems and devices. Common constraints for embedded systems as described by the Security+ exam outline include power, compute, network, crypto, inability to patch, authentication, range, cost, and implied trust.

16- Jim configures a Windows machine with the built-in BitLocker full disk encryption tool. When is the machine least vulnerable to having data stolen from it?

A. When the machine is off

B. When the machine is booted and logged in but is locked

C. When the machine is booted and logged in but is unlocked

D. When the machine is booted and logged in but is asleep

16. A. Jim knows that once a BitLocker-enabled machine is booted, the drive is unlocked and could be accessed. He would be least worried if the machine were off and was stolen, or if the drive itself were stolen from the machine, since the data would not be accessible in either of those cases.

17- Olivia wants to install a host-based security package that can detect attacks against the system coming from the network, but she does not want to take the risk of blocking the attacks since she fears that she might inadvertently block legitimate traffic. What type of tool could she install that will meet this requirement?

A. A host firewall

B. A host intrusion detection system

C. A host intrusion prevention system

D. A data loss prevention tool

17. B. Olivia should install a host-based intrusion detection system. An IDS can detect and report on potential attacks but does not have the ability to stop them. A host-based IPS can be configured to report only on attacks, but it does have the built-in ability to be set up to block them. Firewalls can block known ports, protocols, or applications, but they do not detect attacks— although advanced modern firewalls blur the line between firewalls and other defensive tools. Finally, a data loss prevention tool focuses on preventing data exposures, not on stopping network attacks.

18- Lucca is prototyping an embedded system and wants to use a device that can run a full Linux operating system so that he can install and use a firewall and other security software to protect a web service he will run on it. Which of the following solution should he use?

A. An Arduino

B. An FPGA

C. A Raspberry Pi

D. None of the above

18. C. A Raspberry Pi supports Linux natively and has the resources and hardware to run the operating system and services described. An Arduino is a microcontroller and is better suited to handling a limited set of sensors, actuators, or similar hardware. An FPGA is a specific type of integrated chip that can be programmed to handle specific tasks, but it is not a full computer.

19- Chris wants systems that connect to his network to report their boot processes to a server where they can be validated before being permitted to join the network. What technology should he use to do this on the workstations?

A. UEFI/Trusted bootB. BIOS/Trusted boot

C. UEFI/Measured boot

D. BIOS/Measured boot

19. C. Chris knows that BIOS-based systems do not support either of these modes, and that trusted boot validates every component before loading it, whereas measured boot logs the boot processand sends it to a server that can validate it before permitting the system to connect to the network or perform other actions.

20- Elaine wants to securely erase the contents of a tape used for backups in her organization's tape library. What is the fastest secure erase method available to her that will allow the tape to be reused?

A. Use a degausser.

B. Wipe the tape by writing a random pattern of 1s and 0s to it.

C. Incinerate the tape.

D. Wipe the tape by writing all 1s or all 0s to it.

20. A. A degausser is a quick and effective way to erase a tape before it is reused. Wiping a tape by writing 1s, 0s, or a pattern of 1s and 0s to it will typically be a slow operation and is not a common method of destroying data on a tape. Incinerating the tape won't allow it to be reused!