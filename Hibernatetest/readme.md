Hibernare first code
====================

#First setup MariaDB. 

[root@hnaram ~]# yum install mariadb-server.x86_64

[root@hnaram bin]# service mariadb start

[root@hnaram bin]# mysqladmin -u root password redhat

[root@hnaram bin]# mysql -u root -p

MariaDB [(none)]> create database tutorial;

MariaDB [(none)]> use tutorial;

#create a hibernate.cfg.xml 

<?xml version='1.0' encoding='utf-8'?>
<!DOCTYPE hibernate-configuration PUBLIC
        "-//Hibernate/Hibernate Configuration DTD 3.0//EN"
        "http://hibernate.sourceforge.net/hibernate-configuration-3.0.dtd">
  
<hibernate-configuration>
    <session-factory>
        <!-- Database connection settings -->
        <property name="connection.driver_class">com.mysql.jdbc.Driver</property>
        <property name="connection.url">jdbc:mysql://localhost:3306/tutorial</property>
        <property name="connection.username">root</property>
        <property name="connection.password">redhat</property>
         
        <!-- JDBC connection pool (use the built-in) -->
        <property name="connection.pool_size">1</property>
         
        <!-- SQL dialect -->
        <property name="dialect">org.hibernate.dialect.MySQLDialect</property>
 
        <!-- Enable Hibernate's automatic session context management -->
        <property name="current_session_context_class">thread</property>
 
        <!-- Disable the second-level cache  -->
        <property name="cache.provider_class">org.hibernate.cache.NoCacheProvider</property>
         
        <!-- Echo all executed SQL to stdout -->
        <property name="show_sql">true</property>
         
        <property name="hbm2ddl.auto">create</property>
  
        <mapping class="com.redhat.Userdetails"/>
         
          
    </session-factory>
</hibernate-configuration>


# Run the code and check the table in maria DB


MariaDB [tutorial]> show tables;
Empty set (0.00 sec)

MariaDB [tutorial]> show tables;
+--------------------+
| Tables_in_tutorial |
+--------------------+
| Userdetails        |
+--------------------+
1 row in set (0.00 sec)

MariaDB [tutorial]> select * from Userdetails;
+--------+----------+
| userId | userName |
+--------+----------+
|      1 | Herambh  |
+--------+----------+
1 row in set (0.00 sec)

