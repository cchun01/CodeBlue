GH repo for the fEMR/CodeBlue Team for SE Capstone

Continuous Integration was created using GitHub Actions

Link to Build History: https://github.com/cchun01/CodeBlue/actions


Instructions to set up environment
Download desktop Tableau (this product is good for one year)
Register as student 
Download “fake” data from kaggle.com to use on Tableau
In Tableau > Connect > To a file > Adjust/display data to preference
* Download desktop Tableau (this product is good for one year)
* Register as student 
* Connect to Professor Klingenberg's Central Database in Tableau
 - Tableau cloud > Home > New > Workbook > Connect to Data > Connectors > MySQL

 server = DB_USER = 'admin'
 Database = DB_HOST = 'central.c40st2ss4evd.us-west-2.rds.amazonaws.com'
 password = DB_CREDS = passed to you by admin

Access most recent version of fEMR Operational Dashboard on Tableau to work:
- First, try the link here and in this github repo: https://10az.online.tableau.com/t/cpsecapstonefemrdashboard/views/Sprint8-AdminDashboardPrototype/MainLandingPage

If the above does not work try the below methods:
- Ask for Tableau Cloud access from Professor Klingenberg first. Once that is done, you should be able to go on Tableau Cloud and see our most recent work. Our workbook that we use for CI is called "Sprint 9 - Final Winter Quarter Demo - Admin Dashboard Prototype" as of 3/22/23. Ask Colin for access and then press Edit in any workbook on the Sprint 9 project. Click "Publish As" on the top right and make your own Dashboard to build upon.

- If the above does not work, you can download the Tableau workbook we have in this repo (extension .twbx). If you have Tableau desktop, clicking on the file should open up Tableau Desktop. If not, you can just manually open and work on the Desktop app.

CAUTION: To access our Dashboard on Tableau Cloud or Desktop, you may need the database creds above because it is connected to Prof. Klingenberg's central database.

Continuous Integration was created using GitHub Actions

Link to Build History: https://github.com/cchun01/CodeBlue/actions 

AWS access & Google drive project folder access will be provided to you.
