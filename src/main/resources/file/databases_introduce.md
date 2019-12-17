# 数据库表
## MHStatus 
| 字段名 | 含义 |
| ---- | ---- |
| MHSID | 状态ID |
| MHID | 所在仓库ID |
| MID | 原料ID |
| MHPID | 批次号ID |
| MHTime | 操作时间 |
| MHNum | 操作数量 |

## MP
| 字段名 | 含义 |
| ---- | ---- |
| MPID | 批次号 |
| MID | 原料ID |
| MTime | 原料生产时间 |

## MHouse
| 字段名 | 含义 |
| ---- | ---- |
| MHID | 原料库ID |
| MHName | 原料库名称 |
| MHSite | 原料库地址 |
| MHMan | 原料库负责人ID |
| HRemark | 原料库备注 |

## MHouseLog
| 字段名 | 含义 |
| ---- | ---- |
| MHLID | 原料库日志ID |
| MHID | 操作原料库名称 |
| Oper | 操作方式 |
| MID | 操作原料ID |
| MDate | 操作日期 |
| MLNum | 操作数量 |
| MLMan | 主要负责人 |
| MLWMan | 次要负责人 |

## Materials
| 字段名 | 含义 |
| ---- | ---- |
| MID | 原料ID |
| MName | 原料名称 |
| MPrice | 原料单价 |
| MExpDate | 原料保质期 |
| MRemark | 原料备注 |

