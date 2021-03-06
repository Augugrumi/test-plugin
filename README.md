  <img src="https://raw.githubusercontent.com/openbaton/openbaton.github.io/master/images/openBaton.png" width="250"/>
  
  Copyright © 2015-2016 [Open Baton](http://openbaton.org). 
  Licensed under [Apache v2 License](http://www.apache.org/licenses/LICENSE-2.0).

[![Build Status](https://travis-ci.org/openbaton/test-plugin.svg?branch=master)](https://travis-ci.org/openbaton/test-plugin)

# Test plugin for Vim Driver interface
This plugin imitates the behaviour of a real vim-driver plugin and offers in this way the possibility to test the NFVO without an actual VIM (for instance Openstack). 

It works with [dummy][dummy-vnfm-amqp] implementations of the VNFM. 

## How to install the Test plugin

If you follow the documentation and use the bootstrap script to install Open Baton the Test plugin will already be present.

If you installed Open Baton from source code and cloned the git repositories to your computer you will have to add the Test plugin to the NFVO by hand. 
It is recommended to download the stable version of the plugin from [here][get-openbaton-org] and copy it into the folder *{nfvoRootDir}/plugins/vim-drivers*. 
Afterwards you will have to restart the NFVO.  
Alternatively you can build it by yourself by cloning the Test plugin's git repository, changing into the projects root directory and 
executing 

```bash
  ./gradlew build
```

Afterwards you will find the jar file in the folder *build/libs*.  
Copy it into the folder *{nfvoRootDir}/plugins/vim-drivers* and restart the NFVO.

## How to use the Test plugin

To use the Test plugin you have to register a Vim Instance with the *type* field set to value *test* and use this Vim Instance for deploying your network service. 
Additionally you should use a [dummy][dummy-vnfm-amqp] implementation of a VNFM. 

## Issue tracker

Issues and bug reports should be posted to the GitHub Issue Tracker of this project

## What is Open Baton?

Open Baton is an open source project providing a comprehensive implementation of the ETSI Management and Orchestration (MANO) specification and the TOSCA Standard.

Open Baton provides multiple mechanisms for interoperating with different VNFM vendor solutions. It has a modular architecture which can be easily extended for supporting additional use cases. 

It integrates with OpenStack as standard de-facto VIM implementation, and provides a driver mechanism for supporting additional VIM types. It supports Network Service management either using the provided Generic VNFM and Juju VNFM, or integrating additional specific VNFMs. It provides several mechanisms (REST or PUB/SUB) for interoperating with external VNFMs. 

It can be combined with additional components (Monitoring, Fault Management, Autoscaling, and Network Slicing Engine) for building a unique MANO comprehensive solution.

## Source Code and documentation

The Source Code of the other Open Baton projects can be found [here][openbaton-github] and the documentation can be found [here][openbaton-doc]

## News and Website

Check the [Open Baton Website][openbaton]

Follow us on Twitter @[openbaton][openbaton-twitter]

## Licensing and distribution
Copyright © [2015-2016] Open Baton project

Licensed under the Apache License, Version 2.0 (the "License");

you may not use this file except in compliance with the License.
You may obtain a copy of the License at

  http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

## Support
The Open Baton project provides community support through the Open Baton Public Mailing List and through StackOverflow using the tags openbaton.

## Supported by
  <img src="https://raw.githubusercontent.com/openbaton/openbaton.github.io/master/images/fokus.png" width="250"/><img src="https://raw.githubusercontent.com/openbaton/openbaton.github.io/master/images/tu.png" width="150"/>
  
  
[fokus-logo]: https://raw.githubusercontent.com/openbaton/openbaton.github.io/master/images/fokus.png
[openbaton]: http://openbaton.org
[openbaton-doc]: http://openbaton.org/documentation
[openbaton-github]: http://github.org/openbaton
[openbaton-logo]: https://raw.githubusercontent.com/openbaton/openbaton.github.io/master/images/openBaton.png
[openbaton-mail]: mailto:users@openbaton.org
[openbaton-twitter]: https://twitter.com/openbaton
[tub-logo]: https://raw.githubusercontent.com/openbaton/openbaton.github.io/master/images/tu.png
[dummy-vnfm-amqp]: https://github.com/openbaton/dummy-vnfm-amqp
[get-openbaton-org]: http://get.openbaton.org/plugins/stable/
