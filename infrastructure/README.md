# Infrastructure directory
This directory hosts the configuration to set up the infrastructure for this project.

## Ansible
This contains the inventory file used to determine which EC2 instance acts as the controller
vs agents, and hosts separate playbooks for building the agent, controller, and deployment.
