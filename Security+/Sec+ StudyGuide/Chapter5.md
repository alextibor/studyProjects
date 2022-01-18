# Chapter 5 Security Assessment and Testing

Cybersecurity professionals are responsible for building, operating, and maintaining security controls that protect against these threats. An important component of this maintenance is performing regular security assessment and testing to ensure that controls are operating properly and that the environment contains no exploitable vulnerabilities. This chapter begins with a discussion of vulnerability management, including the design, scheduling, and interpretation of vulnerability scans.

## Vulnerability Management

Our technical environments are complex. We operate servers, endpoint systems, network devices, and many other components that each run millions of lines of code and process complex configurations.

Vulnerability management programs play a crucial role in identifying, prioritizing, and remediating vulnerabilities in our environments. They use vulnerability scanning to detect new vulnerabilities as they arise and then implement a remediation workflow that addresses the highest-priority vulnerabilities. Every organization should incorporate vulnerability management into their cybersecurity program.

## Identifying Scan Targets

Once an organization decides that it wishes to conduct vulnerability scanning and determines which regulatory requirements apply to their scans, they move on to the more detailed phases of the planning process. The next step is to identify the systems that will be covered by the vulnerability scans. Some organizations choose to cover all systems in their scanning process, whereas others scan systems differently (or not at all) depending on the answers to many different questions, including:

    - What is the data classification of the information stored, processed, or transmitted by the system?

    - Is the system exposed to the Internet or other public or semipublic networks?

    - What services are offered by the system?

    - Is the system a production, test, or development system?
  
Organizations also use automated techniques to identify the systems that may be covered by a scan. Cybersecurity professionals use scanning tools to search the network for connected systems. hetherthey were previously known or unknown, and to build an asset inventory. Figure 5.1 shows an example of an asset map developed using the Qualys vulnerability scanner's asset inventory functionality.

![picture 1](../images/f5633c792d5f8c5e0703afc53b08eb02200ceb2ba6fa2c8741924bd74b7ee7d0.png)  

Administrators may then supplement this inventory with additional information about the type of system and the information it handles. This information then helps make determinations about which systems are critical and which are noncritical. Asset inventory and asset criticality information helps guide decisions about the types of scans that are performed, the frequency of those scans, and the priority administrators should place on remediating vulnerabilities detected by the scan. 

## Determining Scan Frequency

Cybersecurity professionals depend on automation to help them perform their duties in an efficient, effective manner. Vulnerability scanning tools allow the automated scheduling of scans to take the burden off administrators.

![picture 2](../images/4cad5f0f1567264d7575d957b850e7dad95a148deae8a6b9e63517ba5a82d373.png)  

Administrators should configure these scans to provide automated alerting when they detect new vulnerabilities. Many security teams configure their scans to produce automated email reports of scan results.

Many different factors influence how often an organization decides to conduct vulnerability scans against its systems:

    The organization's risk appetite is its willingness to tolerate risk within the environment. If an organization is extremely risk averse, it may choose to conduct scans more frequently to minimize the amount of time between when a vulnerability comes into existence and when it is detected by a scan.

    Regulatory requirements, such as those imposed by the Payment Card Industry Data Security Standard (PCI DSS) or the Federal Information Security Management Act (FISMA), maydictate a minimum frequency for vulnerability scans. These requirements may also come from corporate policies.
 

Cybersecurity professionals must balance each of these considerations when planning a vulnerability scanning program. It is usually wise to begin small and slowly expand the scope andfrequency of vulnerability scans over time to avoid overwhelming the scanning infrastructure or enterprise systems.

## Configuring Vulnerability Scans

Vulnerability management solutions provide administrators with the ability to configure many different parameters related to scans. In addition to scheduling automated scans and producing reports, administrators may customize the types of checks performed by the scanner, provide credentials to access target servers, install scanning agents on target servers, and conduct scans from a variety of network perspectives. It is important to conduct regular configuration reviews of vulnerability scanners to ensure that scan settings match current requirements.

## Scan Sensitivity Levels

Cybersecurity professionals configuring vulnerability scans should pay careful attention to the configuration settings related to the scan sensitivity level. These settings determine the types of checks that the scanner will perform and should be customized to ensure that the scan meets its objectives while minimizing the possibility of disrupting the target environment.

Typically, administrators create a new scan by beginning with a template.

