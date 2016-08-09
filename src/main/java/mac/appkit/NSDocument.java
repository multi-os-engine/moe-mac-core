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
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;
import mac.appkit.protocol.NSUserInterfaceValidations;
import mac.foundation.*;
import mac.foundation.protocol.NSFilePresenter;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSDocument extends NSObject implements NSFilePresenter,
		NSUserInterfaceValidations {
	static {
		NatJ.register();
	}

	@Generated
	protected NSDocument(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("PDFPrintOperation")
	public native NSPrintOperation PDFPrintOperation();

	@Generated
	@IsOptional
	@Selector("accommodatePresentedItemDeletionWithCompletionHandler:")
	public native void accommodatePresentedItemDeletionWithCompletionHandler(
			@ObjCBlock(name = "call_accommodatePresentedItemDeletionWithCompletionHandler") NSFilePresenter.Block_accommodatePresentedItemDeletionWithCompletionHandler completionHandler);

	@Generated
	@IsOptional
	@Selector("accommodatePresentedSubitemDeletionAtURL:completionHandler:")
	public native void accommodatePresentedSubitemDeletionAtURLCompletionHandler(
			NSURL url,
			@ObjCBlock(name = "call_accommodatePresentedSubitemDeletionAtURLCompletionHandler") NSFilePresenter.Block_accommodatePresentedSubitemDeletionAtURLCompletionHandler completionHandler);

	@Generated
	@Selector("addWindowController:")
	public native void addWindowController(NSWindowController windowController);

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSDocument alloc();

	@Generated
	@Selector("autosaveDocumentWithDelegate:didAutosaveSelector:contextInfo:")
	public native void autosaveDocumentWithDelegateDidAutosaveSelectorContextInfo(
			@Mapped(ObjCObjectMapper.class) Object delegate,
			SEL didAutosaveSelector, VoidPtr contextInfo);

	@Generated
	@Selector("autosaveWithImplicitCancellability:completionHandler:")
	public native void autosaveWithImplicitCancellabilityCompletionHandler(
			boolean autosavingIsImplicitlyCancellable,
			@ObjCBlock(name = "call_autosaveWithImplicitCancellabilityCompletionHandler") Block_autosaveWithImplicitCancellabilityCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_autosaveWithImplicitCancellabilityCompletionHandler {
		@Generated
		public void call_autosaveWithImplicitCancellabilityCompletionHandler(
				NSError arg0);
	}

	@Generated
	@Selector("autosavedContentsFileURL")
	public native NSURL autosavedContentsFileURL();

	@Generated
	@Selector("autosavesDrafts")
	public static native boolean autosavesDrafts();

	@Generated
	@Selector("autosavesInPlace")
	public static native boolean autosavesInPlace();

	@Generated
	@Selector("autosavingFileType")
	public native String autosavingFileType();

	@Generated
	@Selector("autosavingIsImplicitlyCancellable")
	public native boolean autosavingIsImplicitlyCancellable();

	@Generated
	@Selector("backupFileURL")
	public native NSURL backupFileURL();

	@Generated
	@Selector("browseDocumentVersions:")
	public native void browseDocumentVersions(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("canAsynchronouslyWriteToURL:ofType:forSaveOperation:")
	public native boolean canAsynchronouslyWriteToURLOfTypeForSaveOperation(
			NSURL url, String typeName, long saveOperation);

	@Generated
	@Selector("canCloseDocumentWithDelegate:shouldCloseSelector:contextInfo:")
	public native void canCloseDocumentWithDelegateShouldCloseSelectorContextInfo(
			@Mapped(ObjCObjectMapper.class) Object delegate,
			SEL shouldCloseSelector, VoidPtr contextInfo);

	@Generated
	@Selector("canConcurrentlyReadDocumentsOfType:")
	public static native boolean canConcurrentlyReadDocumentsOfType(
			String typeName);

	@Generated
	@Selector("changeCountTokenForSaveOperation:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object changeCountTokenForSaveOperation(long saveOperation);

	@Generated
	@Selector("checkAutosavingSafetyAndReturnError:")
	public native boolean checkAutosavingSafetyAndReturnError(
			Ptr<NSError> outError);

	@Generated
	@Selector("close")
	public native void close();

	@Generated
	@Selector("continueActivityUsingBlock:")
	public native void continueActivityUsingBlock(
			@ObjCBlock(name = "call_continueActivityUsingBlock") Block_continueActivityUsingBlock block);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_continueActivityUsingBlock {
		@Generated
		public void call_continueActivityUsingBlock();
	}

	@Generated
	@Selector("continueAsynchronousWorkOnMainThreadUsingBlock:")
	public native void continueAsynchronousWorkOnMainThreadUsingBlock(
			@ObjCBlock(name = "call_continueAsynchronousWorkOnMainThreadUsingBlock") Block_continueAsynchronousWorkOnMainThreadUsingBlock block);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_continueAsynchronousWorkOnMainThreadUsingBlock {
		@Generated
		public void call_continueAsynchronousWorkOnMainThreadUsingBlock();
	}

	@Generated
	@Selector("dataOfType:error:")
	public native NSData dataOfTypeError(String typeName, Ptr<NSError> outError);

	@Generated
	@Selector("dataRepresentationOfType:")
	public native NSData dataRepresentationOfType(String type);

	@Generated
	@Selector("defaultDraftName")
	public native String defaultDraftName();

	@Generated
	@Selector("displayName")
	public native String displayName();

	@Generated
	@Selector("duplicateAndReturnError:")
	public native NSDocument duplicateAndReturnError(Ptr<NSError> outError);

	@Generated
	@Selector("duplicateDocument:")
	public native void duplicateDocument(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("duplicateDocumentWithDelegate:didDuplicateSelector:contextInfo:")
	public native void duplicateDocumentWithDelegateDidDuplicateSelectorContextInfo(
			@Mapped(ObjCObjectMapper.class) Object delegate,
			SEL didDuplicateSelector, VoidPtr contextInfo);

	@Generated
	@Selector("encodeRestorableStateWithCoder:")
	public native void encodeRestorableStateWithCoder(NSCoder coder);

	@Generated
	@Selector("fileAttributesToWriteToFile:ofType:saveOperation:")
	public native NSDictionary fileAttributesToWriteToFileOfTypeSaveOperation(
			String fullDocumentPath, String documentTypeName,
			long saveOperationType);

	@Generated
	@Selector("fileAttributesToWriteToURL:ofType:forSaveOperation:originalContentsURL:error:")
	public native NSDictionary fileAttributesToWriteToURLOfTypeForSaveOperationOriginalContentsURLError(
			NSURL url, String typeName, long saveOperation,
			NSURL absoluteOriginalContentsURL, Ptr<NSError> outError);

	@Generated
	@Selector("fileModificationDate")
	public native NSDate fileModificationDate();

	@Generated
	@Selector("fileName")
	public native String fileName();

	@Generated
	@Selector("fileNameExtensionForType:saveOperation:")
	public native String fileNameExtensionForTypeSaveOperation(String typeName,
			long saveOperation);

	@Generated
	@Selector("fileNameExtensionWasHiddenInLastRunSavePanel")
	public native boolean fileNameExtensionWasHiddenInLastRunSavePanel();

	@Generated
	@Selector("fileType")
	public native String fileType();

	@Generated
	@Selector("fileTypeFromLastRunSavePanel")
	public native String fileTypeFromLastRunSavePanel();

	@Generated
	@Selector("fileURL")
	public native NSURL fileURL();

	@Generated
	@Selector("fileWrapperOfType:error:")
	public native NSFileWrapper fileWrapperOfTypeError(String typeName,
			Ptr<NSError> outError);

	@Generated
	@Selector("fileWrapperRepresentationOfType:")
	public native NSFileWrapper fileWrapperRepresentationOfType(String type);

	@Generated
	@Selector("handleCloseScriptCommand:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object handleCloseScriptCommand(NSCloseCommand command);

	@Generated
	@Selector("handlePrintScriptCommand:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object handlePrintScriptCommand(NSScriptCommand command);

	@Generated
	@Selector("handleSaveScriptCommand:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object handleSaveScriptCommand(NSScriptCommand command);

	@Generated
	@Selector("hasUnautosavedChanges")
	public native boolean hasUnautosavedChanges();

	@Generated
	@Selector("hasUndoManager")
	public native boolean hasUndoManager();

	@Generated
	@Selector("init")
	public native NSDocument init();

	@Generated
	@Selector("initForURL:withContentsOfURL:ofType:error:")
	public native NSDocument initForURLWithContentsOfURLOfTypeError(
			NSURL urlOrNil, NSURL contentsURL, String typeName,
			Ptr<NSError> outError);

	@Generated
	@Selector("initWithContentsOfFile:ofType:")
	public native NSDocument initWithContentsOfFileOfType(String absolutePath,
			String typeName);

	@Generated
	@Selector("initWithContentsOfURL:ofType:")
	public native NSDocument initWithContentsOfURLOfType(NSURL url,
			String typeName);

	@Generated
	@Selector("initWithContentsOfURL:ofType:error:")
	public native NSDocument initWithContentsOfURLOfTypeError(NSURL url,
			String typeName, Ptr<NSError> outError);

	@Generated
	@Selector("initWithType:error:")
	public native NSDocument initWithTypeError(String typeName,
			Ptr<NSError> outError);

	@Generated
	@Selector("invalidateRestorableState")
	public native void invalidateRestorableState();

	@Generated
	@Selector("isDocumentEdited")
	public native boolean isDocumentEdited();

	@Generated
	@Selector("isDraft")
	public native boolean isDraft();

	@Generated
	@Selector("isEntireFileLoaded")
	public native boolean isEntireFileLoaded();

	@Generated
	@Selector("isInViewingMode")
	public native boolean isInViewingMode();

	@Generated
	@Selector("isLocked")
	public native boolean isLocked();

	@Generated
	@Selector("isNativeType:")
	public static native boolean isNativeType(String type);

	@Generated
	@Selector("keepBackupFile")
	public native boolean keepBackupFile();

	@Generated
	@Selector("lastComponentOfFileName")
	public native String lastComponentOfFileName();

	@Generated
	@Selector("loadDataRepresentation:ofType:")
	public native boolean loadDataRepresentationOfType(NSData data, String type);

	@Generated
	@Selector("loadFileWrapperRepresentation:ofType:")
	public native boolean loadFileWrapperRepresentationOfType(
			NSFileWrapper wrapper, String type);

	@Generated
	@Selector("lockDocument:")
	public native void lockDocument(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("lockDocumentWithCompletionHandler:")
	public native void lockDocumentWithCompletionHandler(
			@ObjCBlock(name = "call_lockDocumentWithCompletionHandler") Block_lockDocumentWithCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_lockDocumentWithCompletionHandler {
		@Generated
		public void call_lockDocumentWithCompletionHandler(boolean arg0);
	}

	@Generated
	@Selector("lockWithCompletionHandler:")
	public native void lockWithCompletionHandler(
			@ObjCBlock(name = "call_lockWithCompletionHandler") Block_lockWithCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_lockWithCompletionHandler {
		@Generated
		public void call_lockWithCompletionHandler(NSError arg0);
	}

	@Generated
	@Selector("makeWindowControllers")
	public native void makeWindowControllers();

	@Generated
	@Selector("moveDocument:")
	public native void moveDocument(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("moveDocumentToUbiquityContainer:")
	public native void moveDocumentToUbiquityContainer(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("moveDocumentWithCompletionHandler:")
	public native void moveDocumentWithCompletionHandler(
			@ObjCBlock(name = "call_moveDocumentWithCompletionHandler") Block_moveDocumentWithCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_moveDocumentWithCompletionHandler {
		@Generated
		public void call_moveDocumentWithCompletionHandler(boolean arg0);
	}

	@Generated
	@Selector("moveToURL:completionHandler:")
	public native void moveToURLCompletionHandler(
			NSURL url,
			@ObjCBlock(name = "call_moveToURLCompletionHandler") Block_moveToURLCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_moveToURLCompletionHandler {
		@Generated
		public void call_moveToURLCompletionHandler(NSError arg0);
	}

	@Generated
	@Selector("objectSpecifier")
	public native NSScriptObjectSpecifier objectSpecifier();

	@Generated
	@Selector("performSynchronousFileAccessUsingBlock:")
	public native void performSynchronousFileAccessUsingBlock(
			@ObjCBlock(name = "call_performSynchronousFileAccessUsingBlock") Block_performSynchronousFileAccessUsingBlock block);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_performSynchronousFileAccessUsingBlock {
		@Generated
		public void call_performSynchronousFileAccessUsingBlock();
	}

	@Generated
	@Selector("preparePageLayout:")
	public native boolean preparePageLayout(NSPageLayout pageLayout);

	@Generated
	@Selector("prepareSavePanel:")
	public native boolean prepareSavePanel(NSSavePanel savePanel);

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
	@IsOptional
	@Selector("presentedItemDidChange")
	public native void presentedItemDidChange();

	@Generated
	@IsOptional
	@Selector("presentedItemDidGainVersion:")
	public native void presentedItemDidGainVersion(NSFileVersion version);

	@Generated
	@IsOptional
	@Selector("presentedItemDidLoseVersion:")
	public native void presentedItemDidLoseVersion(NSFileVersion version);

	@Generated
	@IsOptional
	@Selector("presentedItemDidMoveToURL:")
	public native void presentedItemDidMoveToURL(NSURL newURL);

	@Generated
	@IsOptional
	@Selector("presentedItemDidResolveConflictVersion:")
	public native void presentedItemDidResolveConflictVersion(
			NSFileVersion version);

	@Generated
	@Selector("presentedItemOperationQueue")
	public native NSOperationQueue presentedItemOperationQueue();

	@Generated
	@Selector("presentedItemURL")
	public native NSURL presentedItemURL();

	@Generated
	@IsOptional
	@Selector("presentedSubitemAtURL:didGainVersion:")
	public native void presentedSubitemAtURLDidGainVersion(NSURL url,
			NSFileVersion version);

	@Generated
	@IsOptional
	@Selector("presentedSubitemAtURL:didLoseVersion:")
	public native void presentedSubitemAtURLDidLoseVersion(NSURL url,
			NSFileVersion version);

	@Generated
	@IsOptional
	@Selector("presentedSubitemAtURL:didMoveToURL:")
	public native void presentedSubitemAtURLDidMoveToURL(NSURL oldURL,
			NSURL newURL);

	@Generated
	@IsOptional
	@Selector("presentedSubitemAtURL:didResolveConflictVersion:")
	public native void presentedSubitemAtURLDidResolveConflictVersion(
			NSURL url, NSFileVersion version);

	@Generated
	@IsOptional
	@Selector("presentedSubitemDidAppearAtURL:")
	public native void presentedSubitemDidAppearAtURL(NSURL url);

	@Generated
	@IsOptional
	@Selector("presentedSubitemDidChangeAtURL:")
	public native void presentedSubitemDidChangeAtURL(NSURL url);

	@Generated
	@Selector("preservesVersions")
	public static native boolean preservesVersions();

	@Generated
	@IsOptional
	@Selector("primaryPresentedItemURL")
	public native NSURL primaryPresentedItemURL();

	@Generated
	@Selector("printDocument:")
	public native void printDocument(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("printDocumentWithSettings:showPrintPanel:delegate:didPrintSelector:contextInfo:")
	public native void printDocumentWithSettingsShowPrintPanelDelegateDidPrintSelectorContextInfo(
			NSDictionary printSettings, boolean showPrintPanel,
			@Mapped(ObjCObjectMapper.class) Object delegate,
			SEL didPrintSelector, VoidPtr contextInfo);

	@Generated
	@Selector("printInfo")
	public native NSPrintInfo printInfo();

	@Generated
	@Selector("printOperationWithSettings:error:")
	public native NSPrintOperation printOperationWithSettingsError(
			NSDictionary printSettings, Ptr<NSError> outError);

	@Generated
	@Selector("printShowingPrintPanel:")
	public native void printShowingPrintPanel(boolean flag);

	@Generated
	@Selector("readFromData:ofType:error:")
	public native boolean readFromDataOfTypeError(NSData data, String typeName,
			Ptr<NSError> outError);

	@Generated
	@Selector("readFromFile:ofType:")
	public native boolean readFromFileOfType(String fileName, String type);

	@Generated
	@Selector("readFromFileWrapper:ofType:error:")
	public native boolean readFromFileWrapperOfTypeError(
			NSFileWrapper fileWrapper, String typeName, Ptr<NSError> outError);

	@Generated
	@Selector("readFromURL:ofType:")
	public native boolean readFromURLOfType(NSURL url, String type);

	@Generated
	@Selector("readFromURL:ofType:error:")
	public native boolean readFromURLOfTypeError(NSURL url, String typeName,
			Ptr<NSError> outError);

	@Generated
	@Selector("readableTypes")
	public static native NSArray readableTypes();

	@Generated
	@Selector("removeWindowController:")
	public native void removeWindowController(
			NSWindowController windowController);

	@Generated
	@Selector("renameDocument:")
	public native void renameDocument(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("restorableStateKeyPaths")
	public static native NSArray restorableStateKeyPaths();

	@Generated
	@Selector("restoreDocumentWindowWithIdentifier:state:completionHandler:")
	public native void restoreDocumentWindowWithIdentifierStateCompletionHandler(
			String identifier,
			NSCoder state,
			@ObjCBlock(name = "call_restoreDocumentWindowWithIdentifierStateCompletionHandler") Block_restoreDocumentWindowWithIdentifierStateCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_restoreDocumentWindowWithIdentifierStateCompletionHandler {
		@Generated
		public void call_restoreDocumentWindowWithIdentifierStateCompletionHandler(
				NSWindow arg0, NSError arg1);
	}

	@Generated
	@Selector("restoreStateWithCoder:")
	public native void restoreStateWithCoder(NSCoder coder);

	@Generated
	@Selector("revertDocumentToSaved:")
	public native void revertDocumentToSaved(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("revertToContentsOfURL:ofType:error:")
	public native boolean revertToContentsOfURLOfTypeError(NSURL url,
			String typeName, Ptr<NSError> outError);

	@Generated
	@Selector("revertToSavedFromFile:ofType:")
	public native boolean revertToSavedFromFileOfType(String fileName,
			String type);

	@Generated
	@Selector("revertToSavedFromURL:ofType:")
	public native boolean revertToSavedFromURLOfType(NSURL url, String type);

	@Generated
	@Selector("runModalPageLayoutWithPrintInfo:")
	public native long runModalPageLayoutWithPrintInfo(NSPrintInfo printInfo);

	@Generated
	@Selector("runModalPageLayoutWithPrintInfo:delegate:didRunSelector:contextInfo:")
	public native void runModalPageLayoutWithPrintInfoDelegateDidRunSelectorContextInfo(
			NSPrintInfo printInfo,
			@Mapped(ObjCObjectMapper.class) Object delegate,
			SEL didRunSelector, VoidPtr contextInfo);

	@Generated
	@Selector("runModalPrintOperation:delegate:didRunSelector:contextInfo:")
	public native void runModalPrintOperationDelegateDidRunSelectorContextInfo(
			NSPrintOperation printOperation,
			@Mapped(ObjCObjectMapper.class) Object delegate,
			SEL didRunSelector, VoidPtr contextInfo);

	@Generated
	@Selector("runModalSavePanelForSaveOperation:delegate:didSaveSelector:contextInfo:")
	public native void runModalSavePanelForSaveOperationDelegateDidSaveSelectorContextInfo(
			long saveOperation,
			@Mapped(ObjCObjectMapper.class) Object delegate,
			SEL didSaveSelector, VoidPtr contextInfo);

	@Generated
	@Selector("runPageLayout:")
	public native void runPageLayout(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("saveDocument:")
	public native void saveDocument(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("saveDocumentAs:")
	public native void saveDocumentAs(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("saveDocumentTo:")
	public native void saveDocumentTo(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("saveDocumentToPDF:")
	public native void saveDocumentToPDF(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("saveDocumentWithDelegate:didSaveSelector:contextInfo:")
	public native void saveDocumentWithDelegateDidSaveSelectorContextInfo(
			@Mapped(ObjCObjectMapper.class) Object delegate,
			SEL didSaveSelector, VoidPtr contextInfo);

	@Generated
	@IsOptional
	@Selector("savePresentedItemChangesWithCompletionHandler:")
	public native void savePresentedItemChangesWithCompletionHandler(
			@ObjCBlock(name = "call_savePresentedItemChangesWithCompletionHandler") NSFilePresenter.Block_savePresentedItemChangesWithCompletionHandler completionHandler);

	@Generated
	@Selector("saveToFile:saveOperation:delegate:didSaveSelector:contextInfo:")
	public native void saveToFileSaveOperationDelegateDidSaveSelectorContextInfo(
			String fileName, long saveOperation,
			@Mapped(ObjCObjectMapper.class) Object delegate,
			SEL didSaveSelector, VoidPtr contextInfo);

	@Generated
	@Selector("saveToURL:ofType:forSaveOperation:completionHandler:")
	public native void saveToURLOfTypeForSaveOperationCompletionHandler(
			NSURL url,
			String typeName,
			long saveOperation,
			@ObjCBlock(name = "call_saveToURLOfTypeForSaveOperationCompletionHandler") Block_saveToURLOfTypeForSaveOperationCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_saveToURLOfTypeForSaveOperationCompletionHandler {
		@Generated
		public void call_saveToURLOfTypeForSaveOperationCompletionHandler(
				NSError arg0);
	}

	@Generated
	@Selector("saveToURL:ofType:forSaveOperation:delegate:didSaveSelector:contextInfo:")
	public native void saveToURLOfTypeForSaveOperationDelegateDidSaveSelectorContextInfo(
			NSURL url, String typeName, long saveOperation,
			@Mapped(ObjCObjectMapper.class) Object delegate,
			SEL didSaveSelector, VoidPtr contextInfo);

	@Generated
	@Selector("saveToURL:ofType:forSaveOperation:error:")
	public native boolean saveToURLOfTypeForSaveOperationError(NSURL url,
			String typeName, long saveOperation, Ptr<NSError> outError);

	@Generated
	@Selector("scheduleAutosaving")
	public native void scheduleAutosaving();

	@Generated
	@Selector("setAutosavedContentsFileURL:")
	public native void setAutosavedContentsFileURL(NSURL url);

	@Generated
	@Selector("setDisplayName:")
	public native void setDisplayName(String displayNameOrNil);

	@Generated
	@Selector("setDraft:")
	public native void setDraft(boolean flag);

	@Generated
	@Selector("setFileModificationDate:")
	public native void setFileModificationDate(NSDate modificationDate);

	@Generated
	@Selector("setFileName:")
	public native void setFileName(String fileName);

	@Generated
	@Selector("setFileType:")
	public native void setFileType(String typeName);

	@Generated
	@Selector("setFileURL:")
	public native void setFileURL(NSURL url);

	@Generated
	@Selector("setHasUndoManager:")
	public native void setHasUndoManager(boolean hasUndoManager);

	@Generated
	@Selector("setLastComponentOfFileName:")
	public native void setLastComponentOfFileName(String str);

	@Generated
	@Selector("setPrintInfo:")
	public native void setPrintInfo(NSPrintInfo printInfo);

	@Generated
	@Selector("setUndoManager:")
	public native void setUndoManager(NSUndoManager undoManager);

	@Generated
	@Selector("setWindow:")
	public native void setWindow(NSWindow window);

	@Generated
	@Selector("shouldChangePrintInfo:")
	public native boolean shouldChangePrintInfo(NSPrintInfo newPrintInfo);

	@Generated
	@Selector("shouldCloseWindowController:delegate:shouldCloseSelector:contextInfo:")
	public native void shouldCloseWindowControllerDelegateShouldCloseSelectorContextInfo(
			NSWindowController windowController,
			@Mapped(ObjCObjectMapper.class) Object delegate,
			SEL shouldCloseSelector, VoidPtr contextInfo);

	@Generated
	@Selector("shouldRunSavePanelWithAccessoryView")
	public native boolean shouldRunSavePanelWithAccessoryView();

	@Generated
	@Selector("showWindows")
	public native void showWindows();

	@Generated
	@Selector("unblockUserInteraction")
	public native void unblockUserInteraction();

	@Generated
	@Selector("undoManager")
	public native NSUndoManager undoManager();

	@Generated
	@Selector("unlockDocument:")
	public native void unlockDocument(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("unlockDocumentWithCompletionHandler:")
	public native void unlockDocumentWithCompletionHandler(
			@ObjCBlock(name = "call_unlockDocumentWithCompletionHandler") Block_unlockDocumentWithCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_unlockDocumentWithCompletionHandler {
		@Generated
		public void call_unlockDocumentWithCompletionHandler(boolean arg0);
	}

	@Generated
	@Selector("unlockWithCompletionHandler:")
	public native void unlockWithCompletionHandler(
			@ObjCBlock(name = "call_unlockWithCompletionHandler") Block_unlockWithCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_unlockWithCompletionHandler {
		@Generated
		public void call_unlockWithCompletionHandler(NSError arg0);
	}

	@Generated
	@Selector("updateChangeCount:")
	public native void updateChangeCount(long change);

	@Generated
	@Selector("updateChangeCountWithToken:forSaveOperation:")
	public native void updateChangeCountWithTokenForSaveOperation(
			@Mapped(ObjCObjectMapper.class) Object changeCountToken,
			long saveOperation);

	@Generated
	@Selector("usesUbiquitousStorage")
	public static native boolean usesUbiquitousStorage();

	@Generated
	@Selector("validateUserInterfaceItem:")
	public native boolean validateUserInterfaceItem(
			@Mapped(ObjCObjectMapper.class) Object anItem);

	@Generated
	@Selector("willNotPresentError:")
	public native void willNotPresentError(NSError error);

	@Generated
	@Selector("willPresentError:")
	public native NSError willPresentError(NSError error);

	@Generated
	@Selector("windowControllerDidLoadNib:")
	public native void windowControllerDidLoadNib(
			NSWindowController windowController);

	@Generated
	@Selector("windowControllerWillLoadNib:")
	public native void windowControllerWillLoadNib(
			NSWindowController windowController);

	@Generated
	@Selector("windowControllers")
	public native NSArray windowControllers();

	@Generated
	@Selector("windowForSheet")
	public native NSWindow windowForSheet();

	@Generated
	@Selector("windowNibName")
	public native String windowNibName();

	@Generated
	@Selector("writableTypes")
	public static native NSArray writableTypes();

	@Generated
	@Selector("writableTypesForSaveOperation:")
	public native NSArray writableTypesForSaveOperation(long saveOperation);

	@Generated
	@Selector("writeSafelyToURL:ofType:forSaveOperation:error:")
	public native boolean writeSafelyToURLOfTypeForSaveOperationError(
			NSURL url, String typeName, long saveOperation,
			Ptr<NSError> outError);

	@Generated
	@Selector("writeToFile:ofType:")
	public native boolean writeToFileOfType(String fileName, String type);

	@Generated
	@Selector("writeToFile:ofType:originalFile:saveOperation:")
	public native boolean writeToFileOfTypeOriginalFileSaveOperation(
			String fullDocumentPath, String documentTypeName,
			String fullOriginalDocumentPath, long saveOperationType);

	@Generated
	@Selector("writeToURL:ofType:")
	public native boolean writeToURLOfType(NSURL url, String type);

	@Generated
	@Selector("writeToURL:ofType:error:")
	public native boolean writeToURLOfTypeError(NSURL url, String typeName,
			Ptr<NSError> outError);

	@Generated
	@Selector("writeToURL:ofType:forSaveOperation:originalContentsURL:error:")
	public native boolean writeToURLOfTypeForSaveOperationOriginalContentsURLError(
			NSURL url, String typeName, long saveOperation,
			NSURL absoluteOriginalContentsURL, Ptr<NSError> outError);

	@Generated
	@Selector("writeWithBackupToFile:ofType:saveOperation:")
	public native boolean writeWithBackupToFileOfTypeSaveOperation(
			String fullDocumentPath, String documentTypeName,
			long saveOperationType);
}
