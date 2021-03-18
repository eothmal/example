#!/bin/bash
LOG='/var/log/workspace-image.log'
echo "SUCCESS $?: Something important happened" | tee -a $LOG
