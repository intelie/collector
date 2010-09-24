

Collector is an example application that uses Spring and Apache Camel to read and write JMS messages from/to ActiveMQ.

Dependencies
============
- [ActiveMQ](http://activemq.apache.org/)
- [maven2](http://maven.apache.org/)

ActiveMQ 5.3.0 or greater version must be set up and running.
Maven must be installed to collector initialization.

Running
=======

	git clone git@github.com:intelie/collector.git
	cd collector
	mvn camel:run

Verifying
=========

	Collector must write messages on activemq "events" queue and read messages from "to-collector" queue.
	ActiveMQ queues can be inspected by default on http://localhost:8161/admin/queues.jsp.


