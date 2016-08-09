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

package mac.security.c;


import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.*;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.*;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.corefoundation.opaque.*;
import mac.security.opaque.*;
import mac.security.struct.*;
import mac.struct.audit_token_t;

@Generated
@Library("Security")
@Runtime(CRuntime.class)
public final class Security {
	static {
		NatJ.register();
	}

	@Generated
	private Security() {
	}

	@Generated
	@CFunction
	public static native void cssmPerror(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String how,
			int error);

	@Generated
	@CFunction
	public static native boolean cssmOidToAlg(
			@UncertainArgument("Options: reference, array Fallback: reference") cssm_data oid,
			IntPtr alg);

	@Generated
	@CFunction
	@UncertainReturn("Options: reference, array Fallback: reference")
	public static native cssm_data cssmAlgToOid(int algId);

	@Generated
	@CFunction
	public static native CFStringRef SecCopyErrorMessageString(int status,
			VoidPtr reserved);

	@Generated
	@CFunction
	public static native long SecAccessGetTypeID();

	@Generated
	@CFunction
	public static native int SecAccessCreate(CFStringRef descriptor,
			CFArrayRef trustedlist, Ptr<SecAccessRef> accessRef);

	@Generated
	@CFunction
	public static native int SecAccessCopyACLList(SecAccessRef accessRef,
			Ptr<CFArrayRef> aclList);

	@Generated
	@CFunction
	public static native long SecCertificateGetTypeID();

	@Generated
	@CFunction
	public static native SecCertificateRef SecCertificateCreateWithData(
			CFAllocatorRef allocator, CFDataRef data);

	@Generated
	@CFunction
	public static native CFDataRef SecCertificateCopyData(
			SecCertificateRef certificate);

	@Generated
	@CFunction
	public static native CFStringRef SecCertificateCopySubjectSummary(
			SecCertificateRef certificate);

	@Generated
	@CFunction
	public static native long SecIdentityGetTypeID();

	@Generated
	@CFunction
	public static native int SecIdentityCopyCertificate(
			SecIdentityRef identityRef, Ptr<SecCertificateRef> certificateRef);

	@Generated
	@CFunction
	public static native int SecIdentityCopyPrivateKey(
			SecIdentityRef identityRef, Ptr<SecKeyRef> privateKeyRef);

	@Generated
	@CFunction
	public static native int SecItemCopyMatching(CFDictionaryRef query,
			Ptr<ConstVoidPtr> result);

	@Generated
	@CFunction
	public static native int SecItemAdd(CFDictionaryRef attributes,
			Ptr<ConstVoidPtr> result);

	@Generated
	@CFunction
	public static native int SecItemUpdate(CFDictionaryRef query,
			CFDictionaryRef attributesToUpdate);

	@Generated
	@CFunction
	public static native int SecItemDelete(CFDictionaryRef query);

	@Generated
	@CFunction
	public static native long SecKeyGetTypeID();

	@Generated
	@CFunction
	public static native long SecKeyGetBlockSize(SecKeyRef key);

	@Generated
	@CFunction
	public static native int SecKeyGeneratePair(CFDictionaryRef parameters,
			Ptr<SecKeyRef> publicKey, Ptr<SecKeyRef> privateKey);

	@Generated
	@CFunction
	public static native long SecKeychainGetTypeID();

	@Generated
	@CFunction
	public static native int SecKeychainGetVersion(IntPtr returnVers);

	@Generated
	@CFunction
	public static native int SecKeychainOpen(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String pathName,
			Ptr<SecKeychainRef> keychain);

	@Generated
	@CFunction
	public static native int SecKeychainCreate(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String pathName,
			int passwordLength, ConstVoidPtr password, byte promptUser,
			SecAccessRef initialAccess, Ptr<SecKeychainRef> keychain);

	@Generated
	@CFunction
	public static native int SecKeychainDelete(SecKeychainRef keychainOrArray);

	@Generated
	@CFunction
	public static native int SecKeychainSetSettings(
			SecKeychainRef keychain,
			@UncertainArgument("Options: reference, array Fallback: reference") SecKeychainSettings newSettings);

	@Generated
	@CFunction
	public static native int SecKeychainCopySettings(
			SecKeychainRef keychain,
			@UncertainArgument("Options: reference, array Fallback: reference") SecKeychainSettings outSettings);

	@Generated
	@CFunction
	public static native int SecKeychainUnlock(SecKeychainRef keychain,
			int passwordLength, ConstVoidPtr password, byte usePassword);

	@Generated
	@CFunction
	public static native int SecKeychainLock(SecKeychainRef keychain);

	@Generated
	@CFunction
	public static native int SecKeychainLockAll();

	@Generated
	@CFunction
	public static native int SecKeychainCopyDefault(Ptr<SecKeychainRef> keychain);

	@Generated
	@CFunction
	public static native int SecKeychainSetDefault(SecKeychainRef keychain);

	@Generated
	@CFunction
	public static native int SecKeychainCopySearchList(
			Ptr<CFArrayRef> searchList);

	@Generated
	@CFunction
	public static native int SecKeychainSetSearchList(CFArrayRef searchList);

	@Generated
	@CFunction
	public static native int SecKeychainCopyDomainDefault(int domain,
			Ptr<SecKeychainRef> keychain);

	@Generated
	@CFunction
	public static native int SecKeychainSetDomainDefault(int domain,
			SecKeychainRef keychain);

	@Generated
	@CFunction
	public static native int SecKeychainCopyDomainSearchList(int domain,
			Ptr<CFArrayRef> searchList);

	@Generated
	@CFunction
	public static native int SecKeychainSetDomainSearchList(int domain,
			CFArrayRef searchList);

	@Generated
	@CFunction
	public static native int SecKeychainSetPreferenceDomain(int domain);

	@Generated
	@CFunction
	public static native int SecKeychainGetPreferenceDomain(IntPtr domain);

	@Generated
	@CFunction
	public static native int SecKeychainGetStatus(SecKeychainRef keychain,
			IntPtr keychainStatus);

	@Generated
	@CFunction
	public static native int SecKeychainGetPath(SecKeychainRef keychain,
			IntPtr ioPathLength, BytePtr pathName);

	@Generated
	@CFunction
	public static native int SecKeychainAttributeInfoForItemID(
			SecKeychainRef keychain, int itemID,
			Ptr<Ptr<SecKeychainAttributeInfo>> info);

	@Generated
	@CFunction
	public static native int SecKeychainFreeAttributeInfo(
			@UncertainArgument("Options: reference, array Fallback: reference") SecKeychainAttributeInfo info);

	@Generated
	@CFunction
	public static native int SecKeychainAddCallback(
			@FunctionPtr(name = "call_SecKeychainAddCallback") Function_SecKeychainAddCallback callbackFunction,
			int eventMask, VoidPtr userContext);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_SecKeychainAddCallback {
		@Generated
		public int call_SecKeychainAddCallback(
				int arg0,
				@UncertainArgument("Options: reference, array Fallback: reference") SecKeychainCallbackInfo arg1,
				VoidPtr arg2);
	}

	@Generated
	@CFunction
	public static native int SecKeychainRemoveCallback(
			@FunctionPtr(name = "call_SecKeychainRemoveCallback") Function_SecKeychainRemoveCallback callbackFunction);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_SecKeychainRemoveCallback {
		@Generated
		public int call_SecKeychainRemoveCallback(
				int arg0,
				@UncertainArgument("Options: reference, array Fallback: reference") SecKeychainCallbackInfo arg1,
				VoidPtr arg2);
	}

	@Generated
	@CFunction
	public static native int SecKeychainAddInternetPassword(
			SecKeychainRef keychain,
			int serverNameLength,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String serverName,
			int securityDomainLength,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String securityDomain,
			int accountNameLength,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String accountName,
			int pathLength,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String path,
			short port, int protocol, int authenticationType,
			int passwordLength, ConstVoidPtr passwordData,
			Ptr<SecKeychainItemRef> itemRef);

	@Generated
	@CFunction
	public static native int SecKeychainFindInternetPassword(
			ConstVoidPtr keychainOrArray,
			int serverNameLength,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String serverName,
			int securityDomainLength,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String securityDomain,
			int accountNameLength,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String accountName,
			int pathLength,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String path,
			short port, int protocol, int authenticationType,
			IntPtr passwordLength, Ptr<VoidPtr> passwordData,
			Ptr<SecKeychainItemRef> itemRef);

	@Generated
	@CFunction
	public static native int SecKeychainAddGenericPassword(
			SecKeychainRef keychain,
			int serviceNameLength,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String serviceName,
			int accountNameLength,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String accountName,
			int passwordLength, ConstVoidPtr passwordData,
			Ptr<SecKeychainItemRef> itemRef);

	@Generated
	@CFunction
	public static native int SecKeychainFindGenericPassword(
			ConstVoidPtr keychainOrArray,
			int serviceNameLength,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String serviceName,
			int accountNameLength,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String accountName,
			IntPtr passwordLength, Ptr<VoidPtr> passwordData,
			Ptr<SecKeychainItemRef> itemRef);

	@Generated
	@CFunction
	public static native int SecKeychainSetUserInteractionAllowed(byte state);

	@Generated
	@CFunction
	public static native int SecKeychainGetUserInteractionAllowed(BytePtr state);

	@Generated
	@CFunction
	public static native int SecKeychainCopyAccess(SecKeychainRef keychain,
			Ptr<SecAccessRef> access);

	@Generated
	@CFunction
	public static native int SecKeychainSetAccess(SecKeychainRef keychain,
			SecAccessRef access);

	@Generated
	@CFunction
	public static native long SecKeychainItemGetTypeID();

	@Generated
	@CFunction
	public static native int SecKeychainItemModifyAttributesAndData(
			SecKeychainItemRef itemRef,
			@UncertainArgument("Options: reference, array Fallback: reference") SecKeychainAttributeList attrList,
			int length, ConstVoidPtr data);

	@Generated
	@CFunction
	public static native int SecKeychainItemCreateFromContent(
			int itemClass,
			@UncertainArgument("Options: reference, array Fallback: reference") SecKeychainAttributeList attrList,
			int length, ConstVoidPtr data, SecKeychainRef keychainRef,
			SecAccessRef initialAccess, Ptr<SecKeychainItemRef> itemRef);

	@Generated
	@CFunction
	public static native int SecKeychainItemModifyContent(
			SecKeychainItemRef itemRef,
			@UncertainArgument("Options: reference, array Fallback: reference") SecKeychainAttributeList attrList,
			int length, ConstVoidPtr data);

	@Generated
	@CFunction
	public static native int SecKeychainItemCopyContent(
			SecKeychainItemRef itemRef,
			IntPtr itemClass,
			@UncertainArgument("Options: reference, array Fallback: reference") SecKeychainAttributeList attrList,
			IntPtr length, Ptr<VoidPtr> outData);

	@Generated
	@CFunction
	public static native int SecKeychainItemFreeContent(
			@UncertainArgument("Options: reference, array Fallback: reference") SecKeychainAttributeList attrList,
			VoidPtr data);

	@Generated
	@CFunction
	public static native int SecKeychainItemCopyAttributesAndData(
			SecKeychainItemRef itemRef,
			@UncertainArgument("Options: reference, array Fallback: reference") SecKeychainAttributeInfo info,
			IntPtr itemClass, Ptr<Ptr<SecKeychainAttributeList>> attrList,
			IntPtr length, Ptr<VoidPtr> outData);

	@Generated
	@CFunction
	public static native int SecKeychainItemFreeAttributesAndData(
			@UncertainArgument("Options: reference, array Fallback: reference") SecKeychainAttributeList attrList,
			VoidPtr data);

	@Generated
	@CFunction
	public static native int SecKeychainItemDelete(SecKeychainItemRef itemRef);

	@Generated
	@CFunction
	public static native int SecKeychainItemCopyKeychain(
			SecKeychainItemRef itemRef, Ptr<SecKeychainRef> keychainRef);

	@Generated
	@CFunction
	public static native int SecKeychainItemCreateCopy(
			SecKeychainItemRef itemRef, SecKeychainRef destKeychainRef,
			SecAccessRef initialAccess, Ptr<SecKeychainItemRef> itemCopy);

	@Generated
	@CFunction
	public static native int SecKeychainItemCreatePersistentReference(
			SecKeychainItemRef itemRef, Ptr<CFDataRef> persistentItemRef);

	@Generated
	@CFunction
	public static native int SecKeychainItemCopyFromPersistentReference(
			CFDataRef persistentItemRef, Ptr<SecKeychainItemRef> itemRef);

	@Generated
	@CFunction
	public static native int SecKeychainItemCopyAccess(
			SecKeychainItemRef itemRef, Ptr<SecAccessRef> access);

	@Generated
	@CFunction
	public static native int SecKeychainItemSetAccess(
			SecKeychainItemRef itemRef, SecAccessRef access);

	@Generated
	@CFunction
	public static native long SecPolicyGetTypeID();

	@Generated
	@CFunction
	public static native CFDictionaryRef SecPolicyCopyProperties(
			SecPolicyRef policyRef);

	@Generated
	@CFunction
	public static native SecPolicyRef SecPolicyCreateBasicX509();

	@Generated
	@CFunction
	public static native SecPolicyRef SecPolicyCreateSSL(byte server,
			CFStringRef hostname);

	@Generated
	@CFunction
	public static native SecPolicyRef SecPolicyCreateRevocation(
			long revocationFlags);

	@Generated
	@CFunction
	public static native SecPolicyRef SecPolicyCreateWithProperties(
			ConstVoidPtr policyIdentifier, CFDictionaryRef properties);

	@Generated
	@CFunction
	public static native long SecTrustGetTypeID();

	@Generated
	@CFunction
	public static native int SecTrustCreateWithCertificates(
			ConstVoidPtr certificates, ConstVoidPtr policies,
			Ptr<SecTrustRef> trust);

	@Generated
	@CFunction
	public static native int SecTrustSetPolicies(SecTrustRef trust,
			ConstVoidPtr policies);

	@Generated
	@CFunction
	public static native int SecTrustCopyPolicies(SecTrustRef trust,
			Ptr<CFArrayRef> policies);

	@Generated
	@CFunction
	public static native int SecTrustSetNetworkFetchAllowed(SecTrustRef trust,
			byte allowFetch);

	@Generated
	@CFunction
	public static native int SecTrustGetNetworkFetchAllowed(SecTrustRef trust,
			BytePtr allowFetch);

	@Generated
	@CFunction
	public static native int SecTrustSetAnchorCertificates(SecTrustRef trust,
			CFArrayRef anchorCertificates);

	@Generated
	@CFunction
	public static native int SecTrustSetAnchorCertificatesOnly(
			SecTrustRef trust, byte anchorCertificatesOnly);

	@Generated
	@CFunction
	public static native int SecTrustCopyCustomAnchorCertificates(
			SecTrustRef trust, Ptr<CFArrayRef> anchors);

	@Generated
	@CFunction
	public static native int SecTrustSetVerifyDate(SecTrustRef trust,
			CFDateRef verifyDate);

	@Generated
	@CFunction
	public static native double SecTrustGetVerifyTime(SecTrustRef trust);

	@Generated
	@CFunction
	public static native int SecTrustEvaluate(SecTrustRef trust, IntPtr result);

	@Generated
	@CFunction
	public static native int SecTrustEvaluateAsync(
			SecTrustRef trust,
			@Mapped(ObjCObjectMapper.class) Object queue,
			@ObjCBlock(name = "call_SecTrustEvaluateAsync") Block_SecTrustEvaluateAsync result);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Block_SecTrustEvaluateAsync {
		@Generated
		public void call_SecTrustEvaluateAsync(VoidPtr arg0, int arg1);
	}

	@Generated
	@CFunction
	public static native int SecTrustGetTrustResult(SecTrustRef trust,
			IntPtr result);

	@Generated
	@CFunction
	public static native SecKeyRef SecTrustCopyPublicKey(SecTrustRef trust);

	@Generated
	@CFunction
	public static native long SecTrustGetCertificateCount(SecTrustRef trust);

	@Generated
	@CFunction
	public static native SecCertificateRef SecTrustGetCertificateAtIndex(
			SecTrustRef trust, long ix);

	@Generated
	@CFunction
	public static native CFDataRef SecTrustCopyExceptions(SecTrustRef trust);

	@Generated
	@CFunction
	public static native boolean SecTrustSetExceptions(SecTrustRef trust,
			CFDataRef exceptions);

	@Generated
	@CFunction
	public static native CFArrayRef SecTrustCopyProperties(SecTrustRef trust);

	@Generated
	@CFunction
	public static native CFDictionaryRef SecTrustCopyResult(SecTrustRef trust);

	@Generated
	@CFunction
	public static native int SecTrustSetOCSPResponse(SecTrustRef trust,
			ConstVoidPtr responseData);

	@Generated
	@CFunction
	public static native long SecTrustedApplicationGetTypeID();

	@Generated
	@CFunction
	public static native int SecTrustedApplicationCreateFromPath(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String path,
			Ptr<SecTrustedApplicationRef> app);

	@Generated
	@CFunction
	public static native int SecTrustedApplicationCopyData(
			SecTrustedApplicationRef appRef, Ptr<CFDataRef> data);

	@Generated
	@CFunction
	public static native int SecTrustedApplicationSetData(
			SecTrustedApplicationRef appRef, CFDataRef data);

	@Generated
	@CFunction
	public static native int SecTrustSettingsCopyTrustSettings(
			SecCertificateRef certRef, int domain, Ptr<CFArrayRef> trustSettings);

	@Generated
	@CFunction
	public static native int SecTrustSettingsSetTrustSettings(
			SecCertificateRef certRef, int domain,
			ConstVoidPtr trustSettingsDictOrArray);

	@Generated
	@CFunction
	public static native int SecTrustSettingsRemoveTrustSettings(
			SecCertificateRef certRef, int domain);

	@Generated
	@CFunction
	public static native int SecTrustSettingsCopyCertificates(int domain,
			Ptr<CFArrayRef> certArray);

	@Generated
	@CFunction
	public static native int SecTrustSettingsCopyModificationDate(
			SecCertificateRef certRef, int domain,
			Ptr<CFDateRef> modificationDate);

	@Generated
	@CFunction
	public static native int SecTrustSettingsCreateExternalRepresentation(
			int domain, Ptr<CFDataRef> trustSettings);

	@Generated
	@CFunction
	public static native int SecTrustSettingsImportExternalRepresentation(
			int domain, CFDataRef trustSettings);

	@Generated
	@CFunction
	public static native int SecPKCS12Import(CFDataRef pkcs12_data,
			CFDictionaryRef options, Ptr<CFArrayRef> items);

	@Generated
	@CFunction
	public static native int SecRandomCopyBytes(SecRandomRef rnd, long count,
			BytePtr bytes);

	@Generated
	@CFunction
	public static native long SecStaticCodeGetTypeID();

	@Generated
	@CFunction
	public static native int SecStaticCodeCreateWithPath(CFURLRef path,
			int flags, Ptr<SecStaticCodeRef> staticCode);

	@Generated
	@CFunction
	public static native int SecStaticCodeCreateWithPathAndAttributes(
			CFURLRef path, int flags, CFDictionaryRef attributes,
			Ptr<SecStaticCodeRef> staticCode);

	@Generated
	@CFunction
	public static native int SecStaticCodeCheckValidity(
			SecStaticCodeRef staticCode, int flags,
			SecRequirementRef requirement);

	@Generated
	@CFunction
	public static native int SecStaticCodeCheckValidityWithErrors(
			SecStaticCodeRef staticCode, int flags,
			SecRequirementRef requirement, Ptr<CFErrorRef> errors);

	@Generated
	@CFunction
	public static native long SecCodeGetTypeID();

	@Generated
	@CFunction
	public static native int SecCodeCopySelf(int flags, Ptr<SecCodeRef> self);

	@Generated
	@CFunction
	public static native int SecCodeCopyStaticCode(SecCodeRef code, int flags,
			Ptr<SecStaticCodeRef> staticCode);

	@Generated
	@CFunction
	public static native int SecCodeCopyHost(SecCodeRef guest, int flags,
			Ptr<SecCodeRef> host);

	@Generated
	@CFunction
	public static native int SecCodeCopyGuestWithAttributes(SecCodeRef host,
			CFDictionaryRef attributes, int flags, Ptr<SecCodeRef> guest);

	@Generated
	@CFunction
	public static native int SecCodeCheckValidity(SecCodeRef code, int flags,
			SecRequirementRef requirement);

	@Generated
	@CFunction
	public static native int SecCodeCheckValidityWithErrors(SecCodeRef code,
			int flags, SecRequirementRef requirement, Ptr<CFErrorRef> errors);

	@Generated
	@CFunction
	public static native int SecCodeCopyPath(SecStaticCodeRef staticCode,
			int flags, Ptr<CFURLRef> path);

	@Generated
	@CFunction
	public static native int SecCodeCopyDesignatedRequirement(
			SecStaticCodeRef code, int flags, Ptr<SecRequirementRef> requirement);

	@Generated
	@CFunction
	public static native int SecCodeCopySigningInformation(
			SecStaticCodeRef code, int flags, Ptr<CFDictionaryRef> information);

	@Generated
	@CFunction
	public static native int SecCodeMapMemory(SecStaticCodeRef code, int flags);

	@Generated
	@CFunction
	public static native int SecHostCreateGuest(int host, int status,
			CFURLRef path, CFDictionaryRef attributes, int flags,
			IntPtr newGuest);

	@Generated
	@CFunction
	public static native int SecHostRemoveGuest(int host, int guest, int flags);

	@Generated
	@CFunction
	public static native int SecHostSelectGuest(int guestRef, int flags);

	@Generated
	@CFunction
	public static native int SecHostSelectedGuest(int flags, IntPtr guestRef);

	@Generated
	@CFunction
	public static native int SecHostSetGuestStatus(int guestRef, int status,
			CFDictionaryRef attributes, int flags);

	@Generated
	@CFunction
	public static native int SecHostSetHostingPort(int hostingPort, int flags);

	@Generated
	@CFunction
	public static native long SecRequirementGetTypeID();

	@Generated
	@CFunction
	public static native int SecRequirementCreateWithData(CFDataRef data,
			int flags, Ptr<SecRequirementRef> requirement);

	@Generated
	@CFunction
	public static native int SecRequirementCreateWithString(CFStringRef text,
			int flags, Ptr<SecRequirementRef> requirement);

	@Generated
	@CFunction
	public static native int SecRequirementCreateWithStringAndErrors(
			CFStringRef text, int flags, Ptr<CFErrorRef> errors,
			Ptr<SecRequirementRef> requirement);

	@Generated
	@CFunction
	public static native int SecRequirementCopyData(
			SecRequirementRef requirement, int flags, Ptr<CFDataRef> data);

	@Generated
	@CFunction
	public static native int SecRequirementCopyString(
			SecRequirementRef requirement, int flags, Ptr<CFStringRef> text);

	@Generated
	@CFunction
	public static native long SecTaskGetTypeID();

	@Generated
	@CFunction
	public static native SecTaskRef SecTaskCreateWithAuditToken(
			CFAllocatorRef allocator, @ByValue audit_token_t token);

	@Generated
	@CFunction
	public static native SecTaskRef SecTaskCreateFromSelf(
			CFAllocatorRef allocator);

	@Generated
	@CFunction
	public static native ConstVoidPtr SecTaskCopyValueForEntitlement(
			SecTaskRef task, CFStringRef entitlement, Ptr<CFErrorRef> error);

	@Generated
	@CFunction
	public static native CFDictionaryRef SecTaskCopyValuesForEntitlements(
			SecTaskRef task, CFArrayRef entitlements, Ptr<CFErrorRef> error);

	@Generated
	@CFunction
	public static native int AuthorizationCreate(
			@UncertainArgument("Options: reference, array Fallback: reference") AuthorizationItemSet rights,
			@UncertainArgument("Options: reference, array Fallback: reference") AuthorizationItemSet environment,
			int flags, Ptr<AuthorizationRef> authorization);

	@Generated
	@CFunction
	public static native int AuthorizationFree(AuthorizationRef authorization,
			int flags);

	@Generated
	@CFunction
	public static native int AuthorizationCopyRights(
			AuthorizationRef authorization,
			@UncertainArgument("Options: reference, array Fallback: reference") AuthorizationItemSet rights,
			@UncertainArgument("Options: reference, array Fallback: reference") AuthorizationItemSet environment,
			int flags, Ptr<Ptr<AuthorizationItemSet>> authorizedRights);

	@Generated
	@CFunction
	public static native void AuthorizationCopyRightsAsync(
			AuthorizationRef authorization,
			@UncertainArgument("Options: reference, array Fallback: reference") AuthorizationItemSet rights,
			@UncertainArgument("Options: reference, array Fallback: reference") AuthorizationItemSet environment,
			int flags,
			@ObjCBlock(name = "call_AuthorizationCopyRightsAsync") Block_AuthorizationCopyRightsAsync callbackBlock);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Block_AuthorizationCopyRightsAsync {
		@Generated
		public void call_AuthorizationCopyRightsAsync(
				int arg0,
				@UncertainArgument("Options: reference, array Fallback: reference") AuthorizationItemSet arg1);
	}

	@Generated
	@CFunction
	public static native int AuthorizationCopyInfo(
			AuthorizationRef authorization,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String tag,
			Ptr<Ptr<AuthorizationItemSet>> info);

	@Generated
	@CFunction
	public static native int AuthorizationMakeExternalForm(
			AuthorizationRef authorization,
			@UncertainArgument("Options: reference, array Fallback: reference") AuthorizationExternalForm extForm);

	@Generated
	@CFunction
	public static native int AuthorizationCreateFromExternalForm(
			@UncertainArgument("Options: reference, array Fallback: reference") AuthorizationExternalForm extForm,
			Ptr<AuthorizationRef> authorization);

	@Generated
	@CFunction
	public static native int AuthorizationFreeItemSet(
			@UncertainArgument("Options: reference, array Fallback: reference") AuthorizationItemSet set);

	@Generated
	@CFunction
	public static native int AuthorizationRightGet(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String rightName,
			Ptr<CFDictionaryRef> rightDefinition);

	@Generated
	@CFunction
	public static native int AuthorizationRightSet(
			AuthorizationRef authRef,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String rightName,
			ConstVoidPtr rightDefinition, CFStringRef descriptionKey,
			CFBundleRef bundle, CFStringRef localeTableName);

	@Generated
	@CFunction
	public static native int AuthorizationRightRemove(
			AuthorizationRef authRef,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String rightName);

	@Generated
	@CFunction
	public static native long CMSDecoderGetTypeID();

	@Generated
	@CFunction
	public static native long SSLContextGetTypeID();

	@Generated
	@CFunction
	public static native SSLContextRef SSLCreateContext(CFAllocatorRef alloc,
			int protocolSide, int connectionType);

	@Generated
	@CFunction
	public static native int SSLGetSessionState(SSLContextRef context,
			IntPtr state);

	@Generated
	@CFunction
	public static native int SSLSetSessionOption(SSLContextRef context,
			int option, byte value);

	@Generated
	@CFunction
	public static native int SSLGetSessionOption(SSLContextRef context,
			int option, BytePtr value);

	@Generated
	@CFunction
	public static native int SSLSetIOFuncs(
			SSLContextRef context,
			@FunctionPtr(name = "call_SSLSetIOFuncs_1") Function_SSLSetIOFuncs_1 readFunc,
			@FunctionPtr(name = "call_SSLSetIOFuncs_2") Function_SSLSetIOFuncs_2 writeFunc);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_SSLSetIOFuncs_1 {
		@Generated
		public int call_SSLSetIOFuncs_1(ConstVoidPtr arg0, VoidPtr arg1,
				LongPtr arg2);
	}

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_SSLSetIOFuncs_2 {
		@Generated
		public int call_SSLSetIOFuncs_2(ConstVoidPtr arg0, ConstVoidPtr arg1,
				LongPtr arg2);
	}

	@Generated
	@CFunction
	public static native int SSLSetProtocolVersionMin(SSLContextRef context,
			int minVersion);

	@Generated
	@CFunction
	public static native int SSLGetProtocolVersionMin(SSLContextRef context,
			IntPtr minVersion);

	@Generated
	@CFunction
	public static native int SSLSetProtocolVersionMax(SSLContextRef context,
			int maxVersion);

	@Generated
	@CFunction
	public static native int SSLGetProtocolVersionMax(SSLContextRef context,
			IntPtr maxVersion);

	@Generated
	@CFunction
	public static native int SSLSetCertificate(SSLContextRef context,
			CFArrayRef certRefs);

	@Generated
	@CFunction
	public static native int SSLSetConnection(SSLContextRef context,
			ConstVoidPtr connection);

	@Generated
	@CFunction
	public static native int SSLGetConnection(SSLContextRef context,
			Ptr<ConstVoidPtr> connection);

	@Generated
	@CFunction
	public static native int SSLSetPeerDomainName(
			SSLContextRef context,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String peerName,
			long peerNameLen);

	@Generated
	@CFunction
	public static native int SSLGetPeerDomainNameLength(SSLContextRef context,
			LongPtr peerNameLen);

	@Generated
	@CFunction
	public static native int SSLGetPeerDomainName(SSLContextRef context,
			BytePtr peerName, LongPtr peerNameLen);

	@Generated
	@CFunction
	public static native int SSLSetDatagramHelloCookie(
			SSLContextRef dtlsContext, ConstVoidPtr cookie, long cookieLen);

	@Generated
	@CFunction
	public static native int SSLSetMaxDatagramRecordSize(
			SSLContextRef dtlsContext, long maxSize);

	@Generated
	@CFunction
	public static native int SSLGetMaxDatagramRecordSize(
			SSLContextRef dtlsContext, LongPtr maxSize);

	@Generated
	@CFunction
	public static native int SSLGetNegotiatedProtocolVersion(
			SSLContextRef context, IntPtr protocol);

	@Generated
	@CFunction
	public static native int SSLGetNumberSupportedCiphers(
			SSLContextRef context, LongPtr numCiphers);

	@Generated
	@CFunction
	public static native int SSLGetSupportedCiphers(SSLContextRef context,
			IntPtr ciphers, LongPtr numCiphers);

	@Generated
	@CFunction
	public static native int SSLSetEnabledCiphers(SSLContextRef context,
			ConstIntPtr ciphers, long numCiphers);

	@Generated
	@CFunction
	public static native int SSLGetNumberEnabledCiphers(SSLContextRef context,
			LongPtr numCiphers);

	@Generated
	@CFunction
	public static native int SSLGetEnabledCiphers(SSLContextRef context,
			IntPtr ciphers, LongPtr numCiphers);

	@Generated
	@CFunction
	public static native int SSLCopyPeerTrust(SSLContextRef context,
			Ptr<SecTrustRef> trust);

	@Generated
	@CFunction
	public static native int SSLSetPeerID(SSLContextRef context,
			ConstVoidPtr peerID, long peerIDLen);

	@Generated
	@CFunction
	public static native int SSLGetPeerID(SSLContextRef context,
			Ptr<ConstVoidPtr> peerID, LongPtr peerIDLen);

	@Generated
	@CFunction
	public static native int SSLGetNegotiatedCipher(SSLContextRef context,
			IntPtr cipherSuite);

	@Generated
	@CFunction
	public static native int SSLSetEncryptionCertificate(SSLContextRef context,
			CFArrayRef certRefs);

	@Generated
	@CFunction
	public static native int SSLSetClientSideAuthenticate(
			SSLContextRef context, int auth);

	@Generated
	@CFunction
	public static native int SSLAddDistinguishedName(SSLContextRef context,
			ConstVoidPtr derDN, long derDNLen);

	@Generated
	@CFunction
	public static native int SSLCopyDistinguishedNames(SSLContextRef context,
			Ptr<CFArrayRef> names);

	@Generated
	@CFunction
	public static native int SSLGetClientCertificateState(
			SSLContextRef context, IntPtr clientState);

	@Generated
	@CFunction
	public static native int SSLHandshake(SSLContextRef context);

	@Generated
	@CFunction
	public static native int SSLWrite(SSLContextRef context, ConstVoidPtr data,
			long dataLength, LongPtr processed);

	@Generated
	@CFunction
	public static native int SSLRead(SSLContextRef context, VoidPtr data,
			long dataLength, LongPtr processed);

	@Generated
	@CFunction
	public static native int SSLGetBufferedReadSize(SSLContextRef context,
			LongPtr bufSize);

	@Generated
	@CFunction
	public static native int SSLGetDatagramWriteSize(SSLContextRef dtlsContext,
			LongPtr bufSize);

	@Generated
	@CFunction
	public static native int SSLClose(SSLContextRef context);

	@Generated
	@CFunction
	public static native long SecTransformGetTypeID();

	@Generated
	@CFunction
	public static native long SecGroupTransformGetTypeID();

	@Generated
	@CFunction
	public static native ConstVoidPtr SecTransformCreateGroupTransform();

	@Generated
	@CFunction
	public static native CFErrorRef SecTransformSetAttributeAction(
			SecTransformImplementationRef ref,
			CFStringRef action,
			ConstVoidPtr attribute,
			@ObjCBlock(name = "call_SecTransformSetAttributeAction") Block_SecTransformSetAttributeAction newAction);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Block_SecTransformSetAttributeAction {
		@Generated
		public ConstVoidPtr call_SecTransformSetAttributeAction(
				ConstVoidPtr arg0, ConstVoidPtr arg1);
	}

	@Generated
	@CFunction
	public static native CFErrorRef SecTransformSetDataAction(
			SecTransformImplementationRef ref,
			CFStringRef action,
			@ObjCBlock(name = "call_SecTransformSetDataAction") Block_SecTransformSetDataAction newAction);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Block_SecTransformSetDataAction {
		@Generated
		public ConstVoidPtr call_SecTransformSetDataAction(ConstVoidPtr arg0);
	}

	@Generated
	@CFunction
	public static native CFErrorRef SecTransformSetTransformAction(
			SecTransformImplementationRef ref,
			CFStringRef action,
			@ObjCBlock(name = "call_SecTransformSetTransformAction") Block_SecTransformSetTransformAction newAction);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Block_SecTransformSetTransformAction {
		@Generated
		public ConstVoidPtr call_SecTransformSetTransformAction();
	}

	@Generated
	@CFunction
	public static native ConstVoidPtr SecTransformCustomGetAttribute(
			SecTransformImplementationRef ref, ConstVoidPtr attribute, long type);

	@Generated
	@CFunction
	public static native ConstVoidPtr SecTransformCustomSetAttribute(
			SecTransformImplementationRef ref, ConstVoidPtr attribute,
			long type, ConstVoidPtr value);

	@Generated
	@CFunction
	public static native ConstVoidPtr SecTransformPushbackAttribute(
			SecTransformImplementationRef ref, ConstVoidPtr attribute,
			ConstVoidPtr value);

	@Generated
	@CFunction
	public static native ConstVoidPtr SecTransformNoData();

	@Generated
	@CVariable()
	@ByValue
	public static native cssm_guid gGuidCssm();

	@Generated
	@CVariable()
	@ByValue
	public static native cssm_guid gGuidAppleFileDL();

	@Generated
	@CVariable()
	@ByValue
	public static native cssm_guid gGuidAppleCSP();

	@Generated
	@CVariable()
	@ByValue
	public static native cssm_guid gGuidAppleCSPDL();

	@Generated
	@CVariable()
	@ByValue
	public static native cssm_guid gGuidAppleX509CL();

	@Generated
	@CVariable()
	@ByValue
	public static native cssm_guid gGuidAppleX509TP();

	@Generated
	@CVariable()
	@ByValue
	public static native cssm_guid gGuidAppleLDAPDL();

	@Generated
	@CVariable()
	@ByValue
	public static native cssm_guid gGuidAppleDotMacTP();

	@Generated
	@CVariable()
	@ByValue
	public static native cssm_guid gGuidAppleSdCSPDL();

	@Generated
	@CVariable()
	@ByValue
	public static native cssm_guid gGuidAppleDotMacDL();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecClass();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecClassInternetPassword();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecClassGenericPassword();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecClassCertificate();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecClassKey();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecClassIdentity();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrAccessible();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrAccessGroup();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrSynchronizable();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrSynchronizableAny();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrCreationDate();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrModificationDate();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrDescription();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrComment();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrCreator();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrType();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrLabel();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrIsInvisible();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrIsNegative();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrAccount();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrService();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrGeneric();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrSecurityDomain();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrServer();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrProtocol();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrAuthenticationType();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrPort();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrPath();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrSubject();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrIssuer();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrSerialNumber();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrSubjectKeyID();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrPublicKeyHash();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrCertificateType();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrCertificateEncoding();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrKeyClass();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrApplicationLabel();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrIsPermanent();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrIsSensitive();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrIsExtractable();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrApplicationTag();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrKeyType();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrKeySizeInBits();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrEffectiveKeySize();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrCanEncrypt();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrCanDecrypt();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrCanDerive();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrCanSign();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrCanVerify();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrCanWrap();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrCanUnwrap();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrAccessibleWhenUnlocked();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrAccessibleAfterFirstUnlock();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrAccessibleAlways();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrAccessibleWhenUnlockedThisDeviceOnly();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrAccessibleAfterFirstUnlockThisDeviceOnly();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrAccessibleAlwaysThisDeviceOnly();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrProtocolFTP();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrProtocolFTPAccount();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrProtocolHTTP();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrProtocolIRC();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrProtocolNNTP();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrProtocolPOP3();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrProtocolSMTP();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrProtocolSOCKS();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrProtocolIMAP();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrProtocolLDAP();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrProtocolAppleTalk();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrProtocolAFP();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrProtocolTelnet();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrProtocolSSH();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrProtocolFTPS();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrProtocolHTTPS();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrProtocolHTTPProxy();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrProtocolHTTPSProxy();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrProtocolFTPProxy();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrProtocolSMB();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrProtocolRTSP();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrProtocolRTSPProxy();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrProtocolDAAP();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrProtocolEPPC();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrProtocolIPP();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrProtocolNNTPS();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrProtocolLDAPS();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrProtocolTelnetS();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrProtocolIMAPS();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrProtocolIRCS();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrProtocolPOP3S();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrAuthenticationTypeNTLM();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrAuthenticationTypeMSN();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrAuthenticationTypeDPA();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrAuthenticationTypeRPA();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrAuthenticationTypeHTTPBasic();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrAuthenticationTypeHTTPDigest();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrAuthenticationTypeHTMLForm();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrAuthenticationTypeDefault();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrKeyClassPublic();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrKeyClassPrivate();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrKeyClassSymmetric();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrKeyTypeRSA();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecAttrKeyTypeEC();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecMatchPolicy();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecMatchItemList();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecMatchSearchList();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecMatchIssuers();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecMatchEmailAddressIfPresent();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecMatchSubjectContains();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecMatchCaseInsensitive();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecMatchTrustedOnly();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecMatchValidOnDate();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecMatchLimit();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecMatchLimitOne();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecMatchLimitAll();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecReturnData();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecReturnAttributes();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecReturnRef();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecReturnPersistentRef();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecValueData();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecValueRef();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecValuePersistentRef();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecUseItemList();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecPolicyAppleX509Basic();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecPolicyAppleSSL();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecPolicyAppleSMIME();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecPolicyAppleEAP();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecPolicyAppleIPsec();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecPolicyAppleCodeSigning();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecPolicyAppleIDValidation();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecPolicyAppleTimeStamping();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecPolicyAppleRevocation();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecPolicyApplePassbookSigning();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecPolicyOid();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecPolicyName();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecPolicyClient();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecPolicyRevocationFlags();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecPolicyTeamIdentifier();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecPropertyTypeTitle();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecPropertyTypeError();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecTrustEvaluationDate();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecTrustExtendedValidation();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecTrustOrganizationName();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecTrustResultValue();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecTrustRevocationChecked();

	@Generated
	@CVariable()
	public static native ConstVoidPtr kSecTrustRevocationValidUntilDate();

	@Generated
	@CVariable()
	public static native CFStringRef kSecImportExportPassphrase();

	@Generated
	@CVariable()
	public static native CFStringRef kSecImportExportKeychain();

	@Generated
	@CVariable()
	public static native CFStringRef kSecImportExportAccess();

	@Generated
	@CVariable()
	public static native CFStringRef kSecImportItemLabel();

	@Generated
	@CVariable()
	public static native CFStringRef kSecImportItemKeyID();

	@Generated
	@CVariable()
	public static native CFStringRef kSecImportItemTrust();

	@Generated
	@CVariable()
	public static native CFStringRef kSecImportItemCertChain();

	@Generated
	@CVariable()
	public static native CFStringRef kSecImportItemIdentity();

	@Generated
	@CVariable()
	public static native SecRandomRef kSecRandomDefault();

	@Generated
	@CVariable()
	public static native CFStringRef kSecCFErrorArchitecture();

	@Generated
	@CVariable()
	public static native CFStringRef kSecCFErrorPattern();

	@Generated
	@CVariable()
	public static native CFStringRef kSecCFErrorResourceSeal();

	@Generated
	@CVariable()
	public static native CFStringRef kSecCFErrorResourceAdded();

	@Generated
	@CVariable()
	public static native CFStringRef kSecCFErrorResourceAltered();

	@Generated
	@CVariable()
	public static native CFStringRef kSecCFErrorResourceMissing();

	@Generated
	@CVariable()
	public static native CFStringRef kSecCFErrorInfoPlist();

	@Generated
	@CVariable()
	public static native CFStringRef kSecCFErrorGuestAttributes();

	@Generated
	@CVariable()
	public static native CFStringRef kSecCFErrorRequirementSyntax();

	@Generated
	@CVariable()
	public static native CFStringRef kSecCFErrorPath();

	@Generated
	@CVariable()
	public static native CFStringRef kSecCodeAttributeArchitecture();

	@Generated
	@CVariable()
	public static native CFStringRef kSecCodeAttributeSubarchitecture();

	@Generated
	@CVariable()
	public static native CFStringRef kSecCodeAttributeUniversalFileOffset();

	@Generated
	@CVariable()
	public static native CFStringRef kSecCodeAttributeBundleVersion();

	@Generated
	@CVariable()
	public static native CFStringRef kSecGuestAttributeCanonical();

	@Generated
	@CVariable()
	public static native CFStringRef kSecGuestAttributeHash();

	@Generated
	@CVariable()
	public static native CFStringRef kSecGuestAttributeMachPort();

	@Generated
	@CVariable()
	public static native CFStringRef kSecGuestAttributePid();

	@Generated
	@CVariable()
	public static native CFStringRef kSecGuestAttributeDynamicCode();

	@Generated
	@CVariable()
	public static native CFStringRef kSecGuestAttributeDynamicCodeInfoPlist();

	@Generated
	@CVariable()
	public static native CFStringRef kSecGuestAttributeArchitecture();

	@Generated
	@CVariable()
	public static native CFStringRef kSecGuestAttributeSubarchitecture();

	@Generated
	@CVariable()
	public static native CFStringRef kSecCodeInfoCertificates();

	@Generated
	@CVariable()
	public static native CFStringRef kSecCodeInfoChangedFiles();

	@Generated
	@CVariable()
	public static native CFStringRef kSecCodeInfoCMS();

	@Generated
	@CVariable()
	public static native CFStringRef kSecCodeInfoDesignatedRequirement();

	@Generated
	@CVariable()
	public static native CFStringRef kSecCodeInfoEntitlements();

	@Generated
	@CVariable()
	public static native CFStringRef kSecCodeInfoEntitlementsDict();

	@Generated
	@CVariable()
	public static native CFStringRef kSecCodeInfoFlags();

	@Generated
	@CVariable()
	public static native CFStringRef kSecCodeInfoFormat();

	@Generated
	@CVariable()
	public static native CFStringRef kSecCodeInfoDigestAlgorithm();

	@Generated
	@CVariable()
	public static native CFStringRef kSecCodeInfoIdentifier();

	@Generated
	@CVariable()
	public static native CFStringRef kSecCodeInfoImplicitDesignatedRequirement();

	@Generated
	@CVariable()
	public static native CFStringRef kSecCodeInfoMainExecutable();

	@Generated
	@CVariable()
	public static native CFStringRef kSecCodeInfoPList();

	@Generated
	@CVariable()
	public static native CFStringRef kSecCodeInfoRequirements();

	@Generated
	@CVariable()
	public static native CFStringRef kSecCodeInfoRequirementData();

	@Generated
	@CVariable()
	public static native CFStringRef kSecCodeInfoSource();

	@Generated
	@CVariable()
	public static native CFStringRef kSecCodeInfoStatus();

	@Generated
	@CVariable()
	public static native CFStringRef kSecCodeInfoTeamIdentifier();

	@Generated
	@CVariable()
	public static native CFStringRef kSecCodeInfoTime();

	@Generated
	@CVariable()
	public static native CFStringRef kSecCodeInfoTimestamp();

	@Generated
	@CVariable()
	public static native CFStringRef kSecCodeInfoTrust();

	@Generated
	@CVariable()
	public static native CFStringRef kSecCodeInfoUnique();

	@Generated
	@CVariable()
	public static native CFStringRef kSecTransformErrorDomain();

	@Generated
	@CVariable()
	public static native CFStringRef kSecTransformPreviousErrorKey();

	@Generated
	@CVariable()
	public static native CFStringRef kSecTransformAbortOriginatorKey();

	@Generated
	@CVariable()
	public static native CFStringRef kSecTransformActionCanExecute();

	@Generated
	@CVariable()
	public static native CFStringRef kSecTransformActionStartingExecution();

	@Generated
	@CVariable()
	public static native CFStringRef kSecTransformActionFinalize();

	@Generated
	@CVariable()
	public static native CFStringRef kSecTransformActionExternalizeExtraData();

	@Generated
	@CVariable()
	public static native CFStringRef kSecTransformActionProcessData();

	@Generated
	@CVariable()
	public static native CFStringRef kSecTransformActionInternalizeExtraData();

	@Generated
	@CVariable()
	public static native CFStringRef kSecTransformActionAttributeNotification();

	@Generated
	@CVariable()
	public static native CFStringRef kSecTransformActionAttributeValidation();

	@Generated
	@CVariable()
	public static native CFStringRef kSecBase64Encoding();

	@Generated
	@CVariable()
	public static native CFStringRef kSecBase32Encoding();

	@Generated
	@CVariable()
	public static native CFStringRef kSecZLibEncoding();

	@Generated
	@CVariable()
	public static native CFStringRef kSecEncodeTypeAttribute();

	@Generated
	@CVariable()
	public static native CFStringRef kSecLineLength64();

	@Generated
	@CVariable()
	public static native CFStringRef kSecLineLength76();

	@Generated
	@CVariable()
	public static native CFStringRef kSecEncodeLineLengthAttribute();

	@Generated
	@CVariable()
	public static native CFStringRef kSecCompressionRatio();

	@Generated
	@CVariable()
	public static native CFStringRef kSecDecodeTypeAttribute();

	@Generated
	@CVariable()
	public static native CFStringRef kSecDigestMD2();

	@Generated
	@CVariable()
	public static native CFStringRef kSecDigestMD4();

	@Generated
	@CVariable()
	public static native CFStringRef kSecDigestMD5();

	@Generated
	@CVariable()
	public static native CFStringRef kSecDigestSHA1();

	@Generated
	@CVariable()
	public static native CFStringRef kSecDigestSHA2();

	@Generated
	@CVariable()
	public static native CFStringRef kSecDigestHMACMD5();

	@Generated
	@CVariable()
	public static native CFStringRef kSecDigestHMACSHA1();

	@Generated
	@CVariable()
	public static native CFStringRef kSecDigestHMACSHA2();

	@Generated
	@CVariable()
	public static native CFStringRef kSecDigestTypeAttribute();

	@Generated
	@CVariable()
	public static native CFStringRef kSecDigestLengthAttribute();

	@Generated
	@CVariable()
	public static native CFStringRef kSecDigestHMACKeyAttribute();

	@Generated
	@CVariable()
	public static native CFStringRef kSecPaddingNoneKey();

	@Generated
	@CVariable()
	public static native CFStringRef kSecPaddingPKCS1Key();

	@Generated
	@CVariable()
	public static native CFStringRef kSecPaddingPKCS5Key();

	@Generated
	@CVariable()
	public static native CFStringRef kSecPaddingPKCS7Key();

	@Generated
	@CVariable()
	public static native CFStringRef kSecPaddingOAEPKey();

	@Generated
	@CVariable()
	public static native CFStringRef kSecModeNoneKey();

	@Generated
	@CVariable()
	public static native CFStringRef kSecModeECBKey();

	@Generated
	@CVariable()
	public static native CFStringRef kSecModeCBCKey();

	@Generated
	@CVariable()
	public static native CFStringRef kSecModeCFBKey();

	@Generated
	@CVariable()
	public static native CFStringRef kSecModeOFBKey();

	@Generated
	@CVariable()
	public static native CFStringRef kSecEncryptKey();

	@Generated
	@CVariable()
	public static native CFStringRef kSecPaddingKey();

	@Generated
	@CVariable()
	public static native CFStringRef kSecIVKey();

	@Generated
	@CVariable()
	public static native CFStringRef kSecEncryptionMode();

	@Generated
	@CVariable()
	public static native CFStringRef kSecOAEPMessageLengthAttributeName();

	@Generated
	@CVariable()
	public static native CFStringRef kSecOAEPEncodingParametersAttributeName();

	@Generated
	@CVariable()
	public static native CFStringRef kSecOAEPMGF1DigestAlgorithmAttributeName();

	@Generated
	@CVariable()
	public static native CFStringRef kSecKeyAttributeName();

	@Generated
	@CVariable()
	public static native CFStringRef kSecSignatureAttributeName();

	@Generated
	@CVariable()
	public static native CFStringRef kSecInputIsAttributeName();

	@Generated
	@CVariable()
	public static native CFStringRef kSecInputIsPlainText();

	@Generated
	@CVariable()
	public static native CFStringRef kSecInputIsDigest();

	@Generated
	@CVariable()
	public static native CFStringRef kSecInputIsRaw();
}
