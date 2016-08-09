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

package mac.corefoundation.enums;


import org.moe.natj.general.ann.Generated;

@Generated
public final class CFXMLParserStatusCode {
	@Generated
	private CFXMLParserStatusCode() {
	}

	@Generated
	public static final long StatusParseNotBegun = 0xFFFFFFFFFFFFFFFEL;
	@Generated
	public static final long StatusParseInProgress = 0xFFFFFFFFFFFFFFFFL;
	@Generated
	public static final long StatusParseSuccessful = 0x0000000000000000L;
	@Generated
	public static final long ErrorUnexpectedEOF = 0x0000000000000001L;
	@Generated
	public static final long ErrorUnknownEncoding = 0x0000000000000002L;
	@Generated
	public static final long ErrorEncodingConversionFailure = 0x0000000000000003L;
	@Generated
	public static final long ErrorMalformedProcessingInstruction = 0x0000000000000004L;
	@Generated
	public static final long ErrorMalformedDTD = 0x0000000000000005L;
	@Generated
	public static final long ErrorMalformedName = 0x0000000000000006L;
	@Generated
	public static final long ErrorMalformedCDSect = 0x0000000000000007L;
	@Generated
	public static final long ErrorMalformedCloseTag = 0x0000000000000008L;
	@Generated
	public static final long ErrorMalformedStartTag = 0x0000000000000009L;
	@Generated
	public static final long ErrorMalformedDocument = 0x000000000000000AL;
	@Generated
	public static final long ErrorElementlessDocument = 0x000000000000000BL;
	@Generated
	public static final long ErrorMalformedComment = 0x000000000000000CL;
	@Generated
	public static final long ErrorMalformedCharacterReference = 0x000000000000000DL;
	@Generated
	public static final long ErrorMalformedParsedCharacterData = 0x000000000000000EL;
	@Generated
	public static final long ErrorNoData = 0x000000000000000FL;
}
