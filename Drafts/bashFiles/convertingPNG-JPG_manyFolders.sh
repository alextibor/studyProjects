#!/bin/bash

converting_image(){
	local IMAGE_PATH=$1
	local IMAGE_WITHOUT_EXTENSION=$(ls $IMAGE_PATH | awk -F. '{ print $1 }')
	convert $IMAGE_WITHOUT_EXTENSION.png $IMAGE_WITHOUT_EXTENSION.jpg
}

sweep_directory(){
	local FOLDER_PATH=$(pwd)
	for file in *
	do	
		local FILE_PATH=$(find $FOLDER_PATH -name $file)
		if [ -d $FILE_PATH ]
		then
			sweep_directory $FILE_PATH
		else
			converting_image $FILE_PATH
		fi
	done
}

sweep_directory
if [ $? -eq 0  ]
then
        echo "Successful conversion!"
else
        echo "Process failed"
fi

