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

package mac.appkit;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.*;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;
import mac.appkit.protocol.NSUserInterfaceValidations;
import mac.appkit.protocol.NSWindowRestoration;
import mac.foundation.NSArray;
import mac.foundation.NSCoder;
import mac.foundation.NSError;
import mac.foundation.NSURL;
import mac.foundation.protocol.NSCoding;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSDocumentController extends NSObject implements NSCoding,
		NSUserInterfaceValidations, NSWindowRestoration {
	static {
		NatJ.register();
	}

	@Generated
	protected NSDocumentController(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("URLsFromRunningOpenPanel")
	public native NSArray URLsFromRunningOpenPanel();

	@Generated
	@Selector("addDocument:")
	public native void addDocument(NSDocument document);

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSDocumentController alloc();

	@Generated
	@Selector("autosavingDelay")
	public native double autosavingDelay();

	@Generated
	@Selector("beginOpenPanel:forTypes:completionHandler:")
	public native void beginOpenPanelForTypesCompletionHandler(
			NSOpenPanel openPanel,
			NSArray inTypes,
			@ObjCBlock(name = "call_beginOpenPanelForTypesCompletionHandler") Block_beginOpenPanelForTypesCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_beginOpenPanelForTypesCompletionHandler {
		@Generated
		public void call_beginOpenPanelForTypesCompletionHandler(long arg0);
	}

	@Generated
	@Selector("beginOpenPanelWithCompletionHandler:")
	public native void beginOpenPanelWithCompletionHandler(
			@ObjCBlock(name = "call_beginOpenPanelWithCompletionHandler") Block_beginOpenPanelWithCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_beginOpenPanelWithCompletionHandler {
		@Generated
		public void call_beginOpenPanelWithCompletionHandler(NSArray arg0);
	}

	@Generated
	@Selector("clearRecentDocuments:")
	public native void clearRecentDocuments(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("closeAllDocumentsWithDelegate:didCloseAllSelector:contextInfo:")
	public native void closeAllDocumentsWithDelegateDidCloseAllSelectorContextInfo(
			@Mapped(ObjCObjectMapper.class) Object delegate,
			SEL didCloseAllSelector, VoidPtr contextInfo);

	@Generated
	@Selector("currentDirectory")
	public native String currentDirectory();

	@Generated
	@Selector("currentDocument")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object currentDocument();

	@Generated
	@Selector("defaultType")
	public native String defaultType();

	@Generated
	@Selector("displayNameForType:")
	public native String displayNameForType(String typeName);

	@Generated
	@Selector("documentClassForType:")
	public native Class documentClassForType(String typeName);

	@Generated
	@Selector("documentClassNames")
	public native NSArray documentClassNames();

	@Generated
	@Selector("documentForFileName:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object documentForFileName(String fileName);

	@Generated
	@Selector("documentForURL:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object documentForURL(NSURL url);

	@Generated
	@Selector("documentForWindow:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object documentForWindow(NSWindow window);

	@Generated
	@Selector("documents")
	public native NSArray documents();

	@Generated
	@Selector("duplicateDocumentWithContentsOfURL:copying:displayName:error:")
	public native NSDocument duplicateDocumentWithContentsOfURLCopyingDisplayNameError(
			NSURL url, boolean duplicateByCopying, String displayNameOrNil,
			Ptr<NSError> outError);

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("fileExtensionsFromType:")
	public native NSArray fileExtensionsFromType(String typeName);

	@Generated
	@Selector("fileNamesFromRunningOpenPanel")
	public native NSArray fileNamesFromRunningOpenPanel();

	@Generated
	@Selector("hasEditedDocuments")
	public native boolean hasEditedDocuments();

	@Generated
	@Selector("init")
	public native NSDocumentController init();

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("makeDocumentForURL:withContentsOfURL:ofType:error:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object makeDocumentForURLWithContentsOfURLOfTypeError(
			NSURL urlOrNil, NSURL contentsURL, String typeName,
			Ptr<NSError> outError);

	@Generated
	@Selector("makeDocumentWithContentsOfFile:ofType:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object makeDocumentWithContentsOfFileOfType(String fileName,
			String type);

	@Generated
	@Selector("makeDocumentWithContentsOfURL:ofType:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object makeDocumentWithContentsOfURLOfType(NSURL url,
			String type);

	@Generated
	@Selector("makeDocumentWithContentsOfURL:ofType:error:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object makeDocumentWithContentsOfURLOfTypeError(NSURL url,
			String typeName, Ptr<NSError> outError);

	@Generated
	@Selector("makeUntitledDocumentOfType:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object makeUntitledDocumentOfType(String type);

	@Generated
	@Selector("makeUntitledDocumentOfType:error:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object makeUntitledDocumentOfTypeError(String typeName,
			Ptr<NSError> outError);

	@Generated
	@Selector("maximumRecentDocumentCount")
	public native long maximumRecentDocumentCount();

	@Generated
	@Selector("newDocument:")
	public native void newDocument(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("noteNewRecentDocument:")
	public native void noteNewRecentDocument(NSDocument document);

	@Generated
	@Selector("noteNewRecentDocumentURL:")
	public native void noteNewRecentDocumentURL(NSURL url);

	@Generated
	@Selector("openDocument:")
	public native void openDocument(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("openDocumentWithContentsOfFile:display:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object openDocumentWithContentsOfFileDisplay(String fileName,
			boolean display);

	@Generated
	@Selector("openDocumentWithContentsOfURL:display:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object openDocumentWithContentsOfURLDisplay(NSURL url,
			boolean display);

	@Generated
	@Selector("openDocumentWithContentsOfURL:display:completionHandler:")
	public native void openDocumentWithContentsOfURLDisplayCompletionHandler(
			NSURL url,
			boolean displayDocument,
			@ObjCBlock(name = "call_openDocumentWithContentsOfURLDisplayCompletionHandler") Block_openDocumentWithContentsOfURLDisplayCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_openDocumentWithContentsOfURLDisplayCompletionHandler {
		@Generated
		public void call_openDocumentWithContentsOfURLDisplayCompletionHandler(
				NSDocument arg0, boolean arg1, NSError arg2);
	}

	@Generated
	@Selector("openDocumentWithContentsOfURL:display:error:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object openDocumentWithContentsOfURLDisplayError(NSURL url,
			boolean displayDocument, Ptr<NSError> outError);

	@Generated
	@Selector("openUntitledDocumentAndDisplay:error:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object openUntitledDocumentAndDisplayError(
			boolean displayDocument, Ptr<NSError> outError);

	@Generated
	@Selector("openUntitledDocumentOfType:display:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object openUntitledDocumentOfTypeDisplay(String type,
			boolean display);

	@Generated
	@Selector("presentError:")
	public native boolean presentError(NSError error);

	@Generated
	@Selector("presentError:modalForWindow:delegate:didPresentSelector:contextInfo:")
	public native void presentErrorModalForWindowDelegateDidPresentSelectorContextInfo(
			NSError error, NSWindow window,
			@Mapped(ObjCObjectMapper.class) Object delegate,
			SEL didPresentSelector, VoidPtr contextInfo);

	@Generated
	@Selector("recentDocumentURLs")
	public native NSArray recentDocumentURLs();

	@Generated
	@Selector("removeDocument:")
	public native void removeDocument(NSDocument document);

	@Generated
	@Selector("reopenDocumentForURL:withContentsOfURL:display:completionHandler:")
	public native void reopenDocumentForURLWithContentsOfURLDisplayCompletionHandler(
			NSURL urlOrNil,
			NSURL contentsURL,
			boolean displayDocument,
			@ObjCBlock(name = "call_reopenDocumentForURLWithContentsOfURLDisplayCompletionHandler") Block_reopenDocumentForURLWithContentsOfURLDisplayCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_reopenDocumentForURLWithContentsOfURLDisplayCompletionHandler {
		@Generated
		public void call_reopenDocumentForURLWithContentsOfURLDisplayCompletionHandler(
				NSDocument arg0, boolean arg1, NSError arg2);
	}

	@Generated
	@Selector("reopenDocumentForURL:withContentsOfURL:error:")
	public native boolean reopenDocumentForURLWithContentsOfURLError(NSURL url,
			NSURL contentsURL, Ptr<NSError> outError);

	@Generated
	@Selector("restoreWindowWithIdentifier:state:completionHandler:")
	public static native void restoreWindowWithIdentifierStateCompletionHandler(
			String identifier,
			NSCoder state,
			@ObjCBlock(name = "call_restoreWindowWithIdentifierStateCompletionHandler") NSWindowRestoration.Block_restoreWindowWithIdentifierStateCompletionHandler completionHandler);

	@Generated
	@ProtocolClassMethod("restoreWindowWithIdentifierStateCompletionHandler")
	public void _restoreWindowWithIdentifierStateCompletionHandler(
			String identifier,
			NSCoder state,
			@ObjCBlock(name = "call_restoreWindowWithIdentifierStateCompletionHandler") NSWindowRestoration.Block_restoreWindowWithIdentifierStateCompletionHandler completionHandler) {
		restoreWindowWithIdentifierStateCompletionHandler(identifier, state,
				completionHandler);
	}

	@Generated
	@Selector("reviewUnsavedDocumentsWithAlertTitle:cancellable:delegate:didReviewAllSelector:contextInfo:")
	public native void reviewUnsavedDocumentsWithAlertTitleCancellableDelegateDidReviewAllSelectorContextInfo(
			String title, boolean cancellable,
			@Mapped(ObjCObjectMapper.class) Object delegate,
			SEL didReviewAllSelector, VoidPtr contextInfo);

	@Generated
	@Selector("runModalOpenPanel:forTypes:")
	public native long runModalOpenPanelForTypes(NSOpenPanel openPanel,
			NSArray types);

	@Generated
	@Selector("saveAllDocuments:")
	public native void saveAllDocuments(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("setAutosavingDelay:")
	public native void setAutosavingDelay(double autosavingDelay);

	@Generated
	@Selector("setShouldCreateUI:")
	public native void setShouldCreateUI(boolean flag);

	@Generated
	@Selector("sharedDocumentController")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object sharedDocumentController();

	@Generated
	@Selector("shouldCreateUI")
	public native boolean shouldCreateUI();

	@Generated
	@Selector("typeForContentsOfURL:error:")
	public native String typeForContentsOfURLError(NSURL url,
			Ptr<NSError> outError);

	@Generated
	@Selector("typeFromFileExtension:")
	public native String typeFromFileExtension(
			String fileNameExtensionOrHFSFileType);

	@Generated
	@Selector("validateUserInterfaceItem:")
	public native boolean validateUserInterfaceItem(
			@Mapped(ObjCObjectMapper.class) Object anItem);

	@Generated
	@Selector("willPresentError:")
	public native NSError willPresentError(NSError error);
}
