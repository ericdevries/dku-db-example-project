dku-example-project
===========

<!-- Remove this comment and extend the descriptions below -->


SYNOPSIS
--------

    dku-example-project { server | check }


DESCRIPTION
-----------

Example


ARGUMENTS
---------

        positional arguments:
        {server,check}         available commands
        
        named arguments:
        -h, --help             show this help message and exit
        -v, --version          show the application version and exit

EXAMPLES
--------

<!-- Add examples of invoking this module from the command line or via HTTP other interfaces -->
    

INSTALLATION AND CONFIGURATION
------------------------------
Currently this project is built as an RPM package for RHEL7/CentOS7 and later. The RPM will install the binaries to
`/opt/dans.knaw.nl/dku-example-project` and the configuration files to `/etc/opt/dans.knaw.nl/dku-example-project`. 

For installation on systems that do no support RPM and/or systemd:

1. Build the tarball (see next section).
2. Extract it to some location on your system, for example `/opt/dans.knaw.nl/dku-example-project`.
3. Start the service with the following command
   ```
   /opt/dans.knaw.nl/dku-example-project/bin/dku-example-project server /opt/dans.knaw.nl/dku-example-project/cfg/config.yml 
   ```

BUILDING FROM SOURCE
--------------------
Prerequisites:

* Java 11 or higher
* Maven 3.3.3 or higher
* RPM

Steps:
    
    git clone https://github.com/DANS-KNAW/dku-example-project.git
    cd dku-example-project 
    mvn clean install

If the `rpm` executable is found at `/usr/local/bin/rpm`, the build profile that includes the RPM 
packaging will be activated. If `rpm` is available, but at a different path, then activate it by using
Maven's `-P` switch: `mvn -Pprm install`.

Alternatively, to build the tarball execute:

    mvn clean install assembly:single
