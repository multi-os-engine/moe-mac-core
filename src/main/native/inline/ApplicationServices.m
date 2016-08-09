/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

//
//  ApplicationServices.m
//

#import <ApplicationServices/ApplicationServices.h>
#import <MacTypes.h>


#define EXPORT __attribute__ ((visibility ("default")))

EXPORT OSErr __natj_inline_InvokeCMFlattenUPP(SInt32 command, long * size, void * data, void * refCon, CMFlattenUPP userUPP) {
// TODO: fails with 10.11 SDK
//	return InvokeCMFlattenUPP(command, size, data, refCon, userUPP);
	return -1;
}

EXPORT void __natj_inline_DisposeCMFlattenUPP(CMFlattenUPP userUPP) {
// TODO: fails with 10.11 SDK
//	DisposeCMFlattenUPP(userUPP);
}

EXPORT Boolean __natj_inline_InvokeCMBitmapCallBackUPP(SInt32 progress, void * refCon, CMBitmapCallBackUPP userUPP) {
// TODO: fails with 10.11 SDK
//	return InvokeCMBitmapCallBackUPP(progress, refCon, userUPP);
	return -1;
}

EXPORT void __natj_inline_DisposeCMBitmapCallBackUPP(CMBitmapCallBackUPP userUPP) {
// TODO: fails with 10.11 SDK
//	DisposeCMBitmapCallBackUPP(userUPP);
}

EXPORT Boolean __natj_inline_InvokeCMConcatCallBackUPP(SInt32 progress, void * refCon, CMConcatCallBackUPP userUPP) {
// TODO: fails with 10.11 SDK
//	return InvokeCMConcatCallBackUPP(progress, refCon, userUPP);
	return -1;
}

EXPORT void __natj_inline_DisposeCMConcatCallBackUPP(CMConcatCallBackUPP userUPP) {
// TODO: fails with 10.11 SDK
//	DisposeCMConcatCallBackUPP(userUPP);
}

EXPORT OSErr __natj_inline_InvokeCMProfileIterateUPP(CMProfileIterateData * iterateData, void * refCon, CMProfileIterateUPP userUPP) {
// TODO: fails with 10.11 SDK
//	return InvokeCMProfileIterateUPP(iterateData, refCon, userUPP);
	return -1;
}

EXPORT void __natj_inline_DisposeCMProfileIterateUPP(CMProfileIterateUPP userUPP) {
// TODO: fails with 10.11 SDK
//	DisposeCMProfileIterateUPP(userUPP);
}

EXPORT OSErr __natj_inline_InvokeCMMIterateUPP(CMMInfo * iterateData, void * refCon, CMMIterateUPP userUPP) {
// TODO: fails with 10.11 SDK
//	return InvokeCMMIterateUPP(iterateData, refCon, userUPP);
	return -1;
}

EXPORT void __natj_inline_DisposeCMMIterateUPP(CMMIterateUPP userUPP) {
// TODO: fails with 10.11 SDK
//	DisposeCMMIterateUPP(userUPP);
}


