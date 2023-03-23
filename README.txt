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

Access most recent version of fEMR Operational Dashboard on Tableau:
- For Professor Klingenberg ONLY: Since you are the Tableau admin, you should be able to go on Tableau Cloud and see our most recent work. Our workbook that we use for CI is called "Sprint 9 - Final Winter Quarter Demo - Admin Dashboard Prototype" as of 3/22/23 and the dashboard demo can be found by following this path/sequence of buttons:
Explore > default > Sprint 9 - Final Winter Quarter Demo - Admin Dashboard Prototype > Main Landing Page

- If the above does not work or you are not Professor Klingenberg, you can download the Tableau workbook we have in this repo (extension .twbx). If you have Tableau desktop, clicking on the file should open up Tableau Desktop. If not, you can just manually open it on the Desktop app.

CAUTION: To access our Dashboard on Tableau Cloud or Desktop, you may need the database creds above because it is connected to Prof. Klingenberg's central database.

Continuous Integration was created using GitHub Actions

Link to Build History: https://github.com/cchun01/CodeBlue/actions 

AWS access & Google drive project folder access will be provided to you.
