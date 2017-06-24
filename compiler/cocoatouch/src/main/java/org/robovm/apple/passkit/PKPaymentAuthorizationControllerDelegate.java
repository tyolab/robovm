/*
 * Copyright (C) 2013-2015 RoboVM AB
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.passkit;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.addressbook.*;
import org.robovm.apple.contacts.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/PKPaymentAuthorizationControllerDelegate/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "paymentAuthorizationController:didAuthorizePayment:completion:")
    void didAuthorizePayment(PKPaymentAuthorizationController controller, PKPayment payment, @Block VoidBlock1<PKPaymentAuthorizationStatus> completion);
    @Method(selector = "paymentAuthorizationControllerDidFinish:")
    void didFinish(PKPaymentAuthorizationController controller);
    @Method(selector = "paymentAuthorizationControllerWillAuthorizePayment:")
    void willAuthorizePayment(PKPaymentAuthorizationController controller);
    @Method(selector = "paymentAuthorizationController:didSelectShippingMethod:completion:")
    void didSelectShippingMethod(PKPaymentAuthorizationController controller, PKShippingMethod shippingMethod, @Block VoidBlock2<PKPaymentAuthorizationStatus, NSArray<PKPaymentSummaryItem>> completion);
    @Method(selector = "paymentAuthorizationController:didSelectShippingContact:completion:")
    void didSelectShippingContact(PKPaymentAuthorizationController controller, PKContact contact, @Block VoidBlock3<PKPaymentAuthorizationStatus, NSArray<PKShippingMethod>, NSArray<PKPaymentSummaryItem>> completion);
    @Method(selector = "paymentAuthorizationController:didSelectPaymentMethod:completion:")
    void didSelectPaymentMethod(PKPaymentAuthorizationController controller, PKPaymentMethod paymentMethod, @Block VoidBlock1<NSArray<PKPaymentSummaryItem>> completion);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}