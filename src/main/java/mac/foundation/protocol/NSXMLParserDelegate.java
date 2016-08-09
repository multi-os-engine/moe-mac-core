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

package mac.foundation.protocol;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import mac.foundation.NSData;
import mac.foundation.NSDictionary;
import mac.foundation.NSError;
import mac.foundation.NSXMLParser;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSXMLParserDelegate")
public interface NSXMLParserDelegate {
	@Generated
	@IsOptional
	@Selector("parser:didEndElement:namespaceURI:qualifiedName:")
	public void parserDidEndElementNamespaceURIQualifiedName(
			NSXMLParser parser, String elementName, String namespaceURI,
			String qName);

	@Generated
	@IsOptional
	@Selector("parser:didEndMappingPrefix:")
	public void parserDidEndMappingPrefix(NSXMLParser parser, String prefix);

	@Generated
	@IsOptional
	@Selector("parser:didStartElement:namespaceURI:qualifiedName:attributes:")
	public void parserDidStartElementNamespaceURIQualifiedNameAttributes(
			NSXMLParser parser, String elementName, String namespaceURI,
			String qName, NSDictionary attributeDict);

	@Generated
	@IsOptional
	@Selector("parser:didStartMappingPrefix:toURI:")
	public void parserDidStartMappingPrefixToURI(NSXMLParser parser,
			String prefix, String namespaceURI);

	@Generated
	@IsOptional
	@Selector("parser:foundAttributeDeclarationWithName:forElement:type:defaultValue:")
	public void parserFoundAttributeDeclarationWithNameForElementTypeDefaultValue(
			NSXMLParser parser, String attributeName, String elementName,
			String type, String defaultValue);

	@Generated
	@IsOptional
	@Selector("parser:foundCDATA:")
	public void parserFoundCDATA(NSXMLParser parser, NSData CDATABlock);

	@Generated
	@IsOptional
	@Selector("parser:foundCharacters:")
	public void parserFoundCharacters(NSXMLParser parser, String string);

	@Generated
	@IsOptional
	@Selector("parser:foundComment:")
	public void parserFoundComment(NSXMLParser parser, String comment);

	@Generated
	@IsOptional
	@Selector("parser:foundElementDeclarationWithName:model:")
	public void parserFoundElementDeclarationWithNameModel(NSXMLParser parser,
			String elementName, String model);

	@Generated
	@IsOptional
	@Selector("parser:foundExternalEntityDeclarationWithName:publicID:systemID:")
	public void parserFoundExternalEntityDeclarationWithNamePublicIDSystemID(
			NSXMLParser parser, String name, String publicID, String systemID);

	@Generated
	@IsOptional
	@Selector("parser:foundIgnorableWhitespace:")
	public void parserFoundIgnorableWhitespace(NSXMLParser parser,
			String whitespaceString);

	@Generated
	@IsOptional
	@Selector("parser:foundInternalEntityDeclarationWithName:value:")
	public void parserFoundInternalEntityDeclarationWithNameValue(
			NSXMLParser parser, String name, String value);

	@Generated
	@IsOptional
	@Selector("parser:foundNotationDeclarationWithName:publicID:systemID:")
	public void parserFoundNotationDeclarationWithNamePublicIDSystemID(
			NSXMLParser parser, String name, String publicID, String systemID);

	@Generated
	@IsOptional
	@Selector("parser:foundProcessingInstructionWithTarget:data:")
	public void parserFoundProcessingInstructionWithTargetData(
			NSXMLParser parser, String target, String data);

	@Generated
	@IsOptional
	@Selector("parser:foundUnparsedEntityDeclarationWithName:publicID:systemID:notationName:")
	public void parserFoundUnparsedEntityDeclarationWithNamePublicIDSystemIDNotationName(
			NSXMLParser parser, String name, String publicID, String systemID,
			String notationName);

	@Generated
	@IsOptional
	@Selector("parser:parseErrorOccurred:")
	public void parserParseErrorOccurred(NSXMLParser parser, NSError parseError);

	@Generated
	@IsOptional
	@Selector("parser:resolveExternalEntityName:systemID:")
	public NSData parserResolveExternalEntityNameSystemID(NSXMLParser parser,
			String name, String systemID);

	@Generated
	@IsOptional
	@Selector("parser:validationErrorOccurred:")
	public void parserValidationErrorOccurred(NSXMLParser parser,
			NSError validationError);

	@Generated
	@IsOptional
	@Selector("parserDidEndDocument:")
	public void parserDidEndDocument(NSXMLParser parser);

	@Generated
	@IsOptional
	@Selector("parserDidStartDocument:")
	public void parserDidStartDocument(NSXMLParser parser);
}
