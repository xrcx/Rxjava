package com.arke.vas;

import android.os.RemoteException;

import com.arke.vas.data.VASPayload;

/**
 * Value added service interface  binder
 * <p>
 * 增值业务接口 Binder
 */
public class VASInterfaceStub  extends IVASInterface.Stub{

    /**
     * 签到
     *
     * @param listener 监听器
     * @see IVASListener
     */
    @Override
    public void signIn(IVASListener listener) throws RemoteException {

    }

    /**
     * Sale transactions
     *
     * @param requestData Consumption body request data, JSON format
     *                    <table border="1" cellspacing="0" cellpadding="5px">
     *                    <tr><th>Parameter</th><th>Type</th><th>Description</th></tr>
     *                    <tr><td>amount</td><td>Double</td><td>Transaction amount</td></tr>
     *                    <tr><td>orderNumber</td><td>String</td><td>Value added service order number</td></tr>
     *                    <tr><td>needAppPrinted</td><td>Boolean</td><td>Whether the need for value added service to print</td></tr>
     *                    <tr><td>inputRemarkInfo</td><td>String</td><td>Value added service need to print the note information</td></tr>
     *                    <tr><td>tellerCardData</td><td>TellerCardData</td><td>Collected card information by the teller</td></tr>
     *                    </table>
     * @param listener    Listener
     *                    <p>
     *                    Examples of consumption request data：
     *                    <br/>
     *                    <img src="../../../image/consume_payload.png">
     * @throws RemoteException
     * @throws RemoteException
     * @see VASPayload
     * @see IVASListener
     * <p>
     * ---------------------------
     * 消费
     * @see VASPayload
     * @see IVASListener
     */
    @Override
    public void sale(VASPayload requestData, IVASListener listener) throws RemoteException {

    }

    /**
     * Sale void transactions
     *
     * @param requestData Sale void body request data, JSON format
     *                    <table border="1" cellspacing="0" cellpadding="5px">
     *                    <tr><th>Parameter</th><th>Type</th><th>Description</th></tr>
     *                    <tr><td>originalVoucherNumber</td><td>String</td><td>Original transaction voucher number</td></tr>
     *                    <tr><td>orderNumber</td><td>String</td><td>Value added service order number</td></tr>
     *                    <tr><td>needAppPrinted</td><td>Boolean</td><td>Whether the need for value added service to print</td></tr>
     *                    <tr><td>inputRemarkInfo</td><td>String</td><td>Value added service need to print the note information</td></tr>
     *                    </table>
     * @param listener    Listener
     * @throws RemoteException
     * @throws RemoteException
     * @see VASPayload
     * @see IVASListener
     * ----------------------------------------
     * 消费撤销
     * @see VASPayload
     * @see IVASListener
     */
    @Override
    public void voided(VASPayload requestData, IVASListener listener) throws RemoteException {

    }

    /**
     * Settlement
     * <p>
     * 结算
     *
     * @param listener
     * @throws RemoteException
     * @see IVASListener
     */
    @Override
    public void settle(IVASListener listener) throws RemoteException {

    }

    /**
     * According to value added service order number to get transaction record
     *
     * @param requestData Body request data, JSON format
     *                    <table border="1" cellspacing="0" cellpadding="5px">
     *                    <tr><th>Parameter</th><th>Type</th><th>Description</th></tr>
     *                    <tr><td>orderNumber</td><td>String</td><td>Value added service order number</td></tr>
     *                    </table>
     * @param listener
     * @see VASPayload
     * @see IVASListener
     * ----------------------------------------
     * 根据增值应用流水获取交易记录
     * @see VASPayload
     * @see IVASListener
     */
    @Override
    public void orderNumberQuery(VASPayload requestData, IVASListener listener) throws RemoteException {

    }

    /**
     * Print transaction summary
     * <p>
     * 打印交易汇总
     *
     * @param listener 监听器
     * @throws RemoteException
     * @see IVASListener
     */
    @Override
    public void printTransactionSummary(IVASListener listener) throws RemoteException {

    }

    /**
     * Print the transaction details
     * <p>
     * 打印交易明细
     *
     * @param listener 监听器
     * @throws RemoteException
     * @see IVASListener
     */
    @Override
    public void printTransactionDetail(IVASListener listener) throws RemoteException {

    }

    /**
     * Terminal key management
     * <p>
     * 终端密钥管理
     *
     * @param listener 监听器
     * @throws RemoteException
     * @see IVASListener
     */
    @Override
    public void terminalKeyManagement(IVASListener listener) throws RemoteException {

    }

    /**
     * Refund transaction
     *
     * @param requestData Refund the body request data, JSON format
     *                    <table border="1" cellspacing="0" cellpadding="5px">
     *                    <tr><th>Parameter</th><th>Type</th><th>Description</th></tr>
     *                    <tr><td>amount</td><td>Double</td><td>Transaction amount</td></tr>
     *                    <tr><td>originalReferenceNumber</td><td>String</td><td>Original transaction reference number</td></tr>
     *                    <tr><td>orderNumber</td><td>String</td><td>Value added service order number</td></tr>
     *                    <tr><td>needAppPrinted</td><td>Boolean</td><td>Whether the need for value added service to print</td></tr>
     *                    <tr><td>inputRemarkInfo</td><td>String</td><td>Value added service need to print the note information</td></tr>
     *                    </table>
     * @param listener    监听器
     * @throws RemoteException
     * @throws RemoteException
     * @see VASPayload
     * @see IVASListener
     * <p>
     * --------------------------------------
     * 退货
     * @see VASPayload
     * @see IVASListener
     */
    @Override
    public void refund(VASPayload requestData, IVASListener listener) throws RemoteException {

    }

    /**
     * Authorization transaction
     *
     * @param requestData Refund the body request data, JSON format
     *                    <table border="1" cellspacing="0" cellpadding="5px">
     *                    <tr><th>Parameter</th><th>Type</th><th>Description</th></tr>
     *                    <tr><td>amount</td><td>Double</td><td>Transaction amount</td></tr>
     *                    <tr><td>cardNumber</td><td>Double</td><td>Card number</td></tr>
     *                    <tr><td>orderNumber</td><td>String</td><td>Value added service order number</td></tr>
     *                    <tr><td>needAppPrinted</td><td>Boolean</td><td>Whether the need for value added service to print</td></tr>
     *                    <tr><td>inputRemarkInfo</td><td>String</td><td>Value added service need to print the note information</td></tr>
     *                    </table>
     * @param listener    监听器
     * @throws RemoteException
     * @throws RemoteException
     * @see VASPayload
     * @see IVASListener
     * <p>
     * ---------------------------------
     * 预授权
     * @see VASPayload
     * @see IVASListener
     */
    @Override
    public void authorization(VASPayload requestData, IVASListener listener) throws RemoteException {

    }

    /**
     * Preauthorization void
     * <p>
     * 预授权撤销
     *
     * @param requestData 请求数据
     * @param listener    监听器
     * @see VASPayload
     * @see IVASListener
     */
    @Override
    public void preAuthorizationVoid(VASPayload requestData, IVASListener listener) throws RemoteException {

    }

    /**
     * Offline settlement transaction
     *
     * @param requestData The body request data, JSON format
     *                    <table border="1" cellspacing="0" cellpadding="5px">
     *                    <tr><th>Parameter</th><th>Type</th><th>Description</th></tr>
     *                    <tr><td>cardNumber</td><td>Double</td><td>Card number</td></tr>
     *                    <tr><td>expiryDate</td><td>String</td><td>Expiry date</td></tr>
     *                    <tr><td>authorizationMethod</td><td>Boolean</td><td>Authorization method</td></tr>
     *                    <tr><td>authorizationCode</td><td>String</td><td>Authorization code</td></tr>
     *                    </table>
     * @param listener    监听器
     * @throws RemoteException
     * @throws RemoteException
     * @see VASPayload
     * @see IVASListener
     * -------------------------------------------------------
     * 离线结算
     * @see VASPayload
     * @see IVASListener
     */
    @Override
    public void offlineSettlement(VASPayload requestData, IVASListener listener) throws RemoteException {

    }

    /**
     * Offline settlement adjustment
     *
     * @param requestData Body request data, JSON format
     *                    <table border="1" cellspacing="0" cellpadding="5px">
     *                    <tr><th>Parameter</th><th>Type</th><th>Description</th></tr>
     *                    <tr><td>originalVoucherNumber</td><td>String</td><td>Original transaction voucher number</td></tr>
     *                    </table>
     * @param listener
     * @throws RemoteException
     * @throws RemoteException
     * @see VASPayload
     * @see IVASListener
     * -------------------------------------------------------
     * 离线结算调整
     * @see VASPayload
     * @see IVASListener
     */
    @Override
    public void settlementAdjustment(VASPayload requestData, IVASListener listener) throws RemoteException {

    }

    /**
     * Get the transaction switch
     *
     * @return 交易开关信息，JSON格式，true 代表收单应用支持该交易，false 代表收单应用不支持该交易
     * @throws RemoteException <p>
     *                         <br/>
     *                         Field description
     *                         <br/>
     *                         <table border="1" cellspacing="0" cellpadding="5px">
     *                         <tr><th>Field</th><th>Description</th></tr>
     *                         <tr><td>SIGNIN</td><td>Sigin</td></tr>
     *                         <tr><td>CONSUME</td><td>Sale transaction</td></tr>
     *                         <tr><td>VOID</td><td>Void transaction</td></tr>
     *                         <tr><td>SETTLE</td><td>Settlement</td></tr>
     *                         <tr><td>ORDER_NUMBER_INQUIRY</td><td>Order number inquiry</td></tr>
     *                         <tr><td>PRINT_TRANSACTION_DETAIL</td><td>Print the transaction details</td></tr>
     *                         <tr><td>PRINT_TRANSACTION_SUMMARY</td><td>Print transaction summary</td></tr>
     *                         <tr><td>TERMINAL_KEY_MANAGEMENT</td><td>Terminal key management</td></tr>
     *                         <tr><td>REFUND</td><td>Refund transaction</td></tr>
     *                         <tr><td>PRE_AUTHORIZATION</td><td>Preauthorization transaction</td></tr>
     *                         <tr><td>PRE_AUTH_VOID</td><td>Preauthorization void transaction</td></tr>
     *                         <tr><td>OFFLINE_SETTLEMENT</td><td>Offline settlement</td></tr>
     *                         <tr><td>SETTLEMENT_ADJUSTMENT</td><td>Offline settlement adjustment</td></tr>
     *                         <tr><td>DOTASK</td><td>Perform scheduled tasks</td></tr>
     *                         <tr><td>ADJUST_TIPS</td><td>Tip adjustment</td></tr>
     *                         <tr><td>OFFLINE</td><td>Offline</td></tr>
     *                         <tr><td>SCAN</td><td>Scanning</td></tr>
     *                         </table>
     *                         <br/>
     *                         <p>
     *                         Example:
     *                         <br/>
     *                         <img src="get_action_config_json.png">
     *                         -------------------------------------------------------
     *                         获取交易开关
     * @throws RemoteException <p>
     *                         <br/>
     *                         字段说明
     *                         <br/>
     *                         <table border="1" cellspacing="0" cellpadding="5px">
     *                         <tr><th>字段</th><th>说明</th></tr>
     *                         <tr><td>CONSUME</td><td>消费</td></tr>
     *                         <tr><td>VOID</td><td>撤销</td></tr>
     *                         <tr><td>SIGNIN</td><td>签到</td></tr>
     *                         <tr><td>SETTLE</td><td>结算</td></tr>
     *                         <tr><td>ORDER_NUMBER_INQUIRY</td><td>流水号查询</td></tr>
     *                         <tr><td>PRINT_TRANSACTION_DETAIL</td><td>打印交易明细</td></tr>
     *                         <tr><td>PRINT_TRANSACTION_SUMMARY</td><td>打印交易汇总</td></tr>
     *                         <tr><td>TERMINAL_KEY_MANAGEMENT</td><td>终端密钥管理</td></tr>
     *                         <tr><td>REFUND</td><td>退货</td></tr>
     *                         <tr><td>PRE_AUTHORIZATION</td><td>预授权</td></tr>
     *                         <tr><td>PRE_AUTH_VOID</td><td>预授权撤销</td></tr>
     *                         <tr><td>OFFLINE_SETTLEMENT</td><td>离线结算</td></tr>
     *                         <tr><td>SETTLEMENT_ADJUSTMENT</td><td>离线结算调整</td></tr>
     *                         <tr><td>DOTASK</td><td>执行计划任务</td></tr>
     *                         <tr><td>ADJUST_TIPS</td><td>小费调整</td></tr>
     *                         <tr><td>OFFLINE</td><td>离线</td></tr>
     *                         <tr><td>SCAN</td><td>扫码</td></tr>
     *                         </table>
     *                         <br/>
     *                         <p>
     *                         例子：
     *                         <br/>
     *                         <img src="get_action_config_json.png">
     */
    @Override
    public String getActionConfig() throws RemoteException {
        return null;
    }

    /**
     * Get the AID list
     *
     * @return AIDS 列表，JSON格式，true 代表收单应用完全匹配，false 代表收单应用部分匹配
     * @throws RemoteException <br/>
     *                         Example:
     *                         <p>
     *                         <br/>
     *                         <img src="get_aids_json.png">
     *                         ---------------------------
     *                         获取 AID 列表
     * @throws RemoteException <br/>
     *                         返回例子
     *                         <p>
     *                         <br/>
     *                         <img src="get_aids_json.png">
     */
    @Override
    public String getAids() throws RemoteException {
        return null;
    }

    /**
     * Reserved transaction extension interface (not used)
     * <p>
     * 预留交易扩展接口(暂不使用)
     *
     * @param requestData
     * @param listener
     * @throws RemoteException
     * @see VASPayload
     * @see IVASListener
     */
    @Override
    public void doAction(VASPayload requestData, IVASListener listener) throws RemoteException {

    }

    /**
     * Get coupons
     * <p>
     * 获得优惠券
     *
     * @param requestData
     * @param listener
     * @throws RemoteException
     * @see VASPayload
     * @see IVASListener
     */
    @Override
    public void getCoupon(VASPayload requestData, IVASListener listener) throws RemoteException {

    }

    /**
     * Revoke coupon
     * <p>
     * 撤销优惠券
     *
     * @param requestData
     * @param listener
     * @throws RemoteException
     * @see VASPayload
     * @see IVASListener
     */
    @Override
    public void voidCoupon(VASPayload requestData, IVASListener listener) throws RemoteException {

    }

    /**
     * Perform scheduled tasks
     * <p>
     * 执行计划任务
     *
     * @param listener
     * @see IVASListener
     */
    @Override
    public void doTask(IVASListener listener) throws RemoteException {

    }

    /**
     * Get the scheduled task
     * <p>
     * 获取计划任务
     *
     * @return crontab表达式 crontab expression
     */
    @Override
    public String getTaskConfig() throws RemoteException {
        return null;
    }

    /**
     * Tip adjustment
     * <p>
     * 小费调整
     *
     * @param requestData
     * @param listener
     * @see VASPayload
     * @see IVASListener
     */
    @Override
    public void adjustTips(VASPayload requestData, IVASListener listener) throws RemoteException {

    }

    /**
     * offline
     * <p>
     * 离线
     *
     * @param requestData
     * @param listener
     * @see VASPayload
     * @see IVASListener
     */
    @Override
    public void offline(VASPayload requestData, IVASListener listener) throws RemoteException {

    }

    /**
     * Scan code
     * <p>
     * 扫码
     *
     * @param requestData
     * @param listener
     * @see VASPayload
     * @see IVASListener
     */
    @Override
    public void scanCode(VASPayload requestData, IVASListener listener) throws RemoteException {

    }
}
