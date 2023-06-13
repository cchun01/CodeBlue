GH repo for the fEMR/CodeBlue Team for SE Capstone

Link to tech spec: https://docs.google.com/document/d/1-XSHHEQp9-DIfkYrS3eT8o6G8JyqTZrLy5TLC_xme3I/edit?usp=sharing

New tech spec changes:
- Testing
- Use Case Diagram

Continuous Integration was created using GitHub Actions

Link to Build History: https://github.com/cchun01/CodeBlue/actions

Beta Release Instructions to set up environment:

Access most recent version of fEMR Operational Dashboard on Tableau to work:
- First, try the link here and in this github repo: https://10az.online.tableau.com/#/site/cpsecapstonefemrdashboard/views/Sprint12Prototype/MainLandingPage?:iid=1
If the above does NOT WORK try the below methods:
- Ask for Tableau Cloud access from Professor Klingenberg first. Once that is done, you should be able to go on Tableau Cloud and see our most recent work after logging in with credentials.
 	- You can also view the dashboard view on our project website.
Our workbook that we use for version control is called "Sprint 12 Prototype" as of 6/13/23. 
Ask Colin for access and then press Edit in any workbook on the Sprint 12 Prototype project. 
Click "Publish As" on the top right and make your own Dashboard to build upon.
 
 
- If the above does not work, you can download the Tableau workbook we have in this repo (extension .twbx). 
If you have Tableau desktop, clicking on the file should open up Tableau Desktop. 
If not, you can just manually open and work on the Desktop app.
 
CAUTION: To access our Dashboard on Tableau Cloud or Desktop, you may need the database creds above because it is connected to Prof. Klingenberg's central database.

AWS access & Google drive project folder access will be provided to you.
 

How to install and use the Tableau Operational Dashboard in Web Browser

ACCESS BY TABLEAU CLOUD
 
1.1) Use Tableau Cloud in a web browser
Tableau Online Cloud https://sso.online.tableau.com/public/idp/SSO
 
1.2) Register as student 

1.3) Click on Home

1.4) Select New at top right of page, Once the drop down menu appears select Workbook

1.5) Select Connectors then locate & select MySQL

1.6) In the General Tab,
 In server input – centraltab.c40st2s4evd.us-west-2.rds.amazonaws.com
Username – admin
Password – Do not type anything in this field rather ask Prof Klingenberg for the password

1.7) Finished 
